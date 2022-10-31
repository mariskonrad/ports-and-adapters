package com.projeto.hexagonal.application.presentation.controller;

import com.projeto.hexagonal.application.presentation.request.IncluirPetRequest;
import com.projeto.hexagonal.application.presentation.response.PetResponse;
import com.projeto.hexagonal.core.ports.BuscarPetPorIdService;
import com.projeto.hexagonal.core.ports.DeletarPetPorIdService;
import com.projeto.hexagonal.core.ports.IncluirPetService;
import com.projeto.hexagonal.core.ports.ListarPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.projeto.hexagonal.application.mapper.IncluirPetMapper.requestToPet;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private IncluirPetService incluirPetService;

    @Autowired
    private ListarPetService listarPetService;

    @Autowired
    private DeletarPetPorIdService deletarPetPorIdService;

    @Autowired
    private BuscarPetPorIdService buscarPetPorIdService;

    @PostMapping
    public void incluir(@RequestBody @Valid IncluirPetRequest petRequest) {
        var pet = requestToPet(petRequest);
        incluirPetService.incluirNovoPet(pet);
    }

    @GetMapping("/{id}")
    public PetResponse buscarPetPorId(@PathVariable Long id) {
        return buscarPetPorIdService.buscarPetPorId(id);
    }

    @GetMapping
    public ResponseEntity<List<PetResponse>> listar() {
        List<PetResponse> lista = listarPetService.listarPets();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        deletarPetPorIdService.deletarPetPorId(id);
    }
}
