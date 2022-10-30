package com.projeto.hexagonal.application.presentation.controller;

import com.projeto.hexagonal.application.presentation.request.IncluirPetRequest;
import com.projeto.hexagonal.core.domain.Pet;
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

    @PostMapping
    public void incluir(@RequestBody @Valid IncluirPetRequest petRequest) {
        var pet = requestToPet(petRequest);
        incluirPetService.incluirNovoPet(pet);
    }

    @GetMapping
    public ResponseEntity<List<Pet>> listar() {
        List<Pet> lista = listarPetService.listarPets();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
}
