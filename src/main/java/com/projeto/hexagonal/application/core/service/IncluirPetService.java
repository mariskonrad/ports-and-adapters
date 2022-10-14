package com.projeto.hexagonal.application.core.service;

import com.projeto.hexagonal.adapters.inbound.mapper.IncluirPetMapper;
import com.projeto.hexagonal.adapters.inbound.request.IncluirPetRequest;
import com.projeto.hexagonal.application.core.domain.Pet;
import com.projeto.hexagonal.application.ports.out.IncluirPetPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncluirPetService {

    @Autowired
    private IncluirPetPort incluirPetPort;

    public Pet incluir(IncluirPetRequest petRequest) {
        Pet pet = IncluirPetMapper.requestToPet(petRequest);
        return incluirPetPort.incluir(pet);
    }
}
