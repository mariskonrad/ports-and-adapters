package com.projeto.hexagonal.adapters.controller;

import com.projeto.hexagonal.adapters.inbound.request.IncluirPetRequest;
import com.projeto.hexagonal.application.core.domain.Pet;
import com.projeto.hexagonal.application.core.service.IncluirPetService;
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
    public Pet incluir(@RequestBody IncluirPetRequest petRequest) {
        return incluirPetService.incluir(petRequest);
    }
}
