package com.projeto.hexagonal.application.presentation.controller;

import com.projeto.hexagonal.application.presentation.request.AtualizarPetRequest;
import com.projeto.hexagonal.application.presentation.request.IncluirPetRequest;
import com.projeto.hexagonal.application.presentation.response.PetResponse;
import com.projeto.hexagonal.core.ports.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @Autowired
    private AtualizarPetService atualizarPetService;

    @PostMapping
    public void incluir(@RequestBody @Valid IncluirPetRequest petRequest) {
        incluirPetService.incluirNovoPet(petRequest);
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

    @PutMapping("/{id}")
    public void atualizar(@RequestBody AtualizarPetRequest request, @PathVariable Long id) {
        atualizarPetService.atualizar(id, request);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        deletarPetPorIdService.deletarPetPorId(id);
    }
}
