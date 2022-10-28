package com.projeto.hexagonal.application.presentation.controller;

import com.projeto.hexagonal.application.presentation.request.IncluirPetRequest;
import com.projeto.hexagonal.application.service.IncluirPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private IncluirPetService incluirPetService;

    @PostMapping
    public void incluir(@RequestBody IncluirPetRequest petRequest) {
        incluirPetService.incluirNovoPet(petRequest);
    }
}
