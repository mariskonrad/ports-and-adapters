package com.projeto.hexagonal.application.presentation.controller;

import com.projeto.hexagonal.application.presentation.request.IncluirPetRequest;
import com.projeto.hexagonal.application.service.IncluirPetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.projeto.hexagonal.application.mapper.IncluirPetMapper.requestToPet;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private IncluirPetServiceImpl incluirPetServiceImpl;

    @PostMapping
    public void incluir(@RequestBody @Valid IncluirPetRequest petRequest) {
        var pet = requestToPet(petRequest);
        incluirPetServiceImpl.incluirNovoPet(pet);
    }
}
