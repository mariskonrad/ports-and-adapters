package com.projeto.hexagonal.adapters.controller;

import com.projeto.hexagonal.application.core.service.IncluirPetService;
import com.projeto.hexagonal.adapters.inbound.request.IncluirPetRequest;
import com.projeto.hexagonal.adapters.inbound.response.IncluirPetResponse;
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
    public IncluirPetResponse incluir(@RequestBody IncluirPetRequest petRequest) {
        return incluirPetService.incluir(petRequest);
    }
}
