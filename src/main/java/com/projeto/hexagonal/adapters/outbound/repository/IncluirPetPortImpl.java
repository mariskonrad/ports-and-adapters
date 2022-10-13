package com.projeto.hexagonal.adapters.outbound.repository;

import com.projeto.hexagonal.adapters.inbound.entity.PetEntity;
import com.projeto.hexagonal.adapters.inbound.mapper.IncluirPetMapper;
import com.projeto.hexagonal.adapters.inbound.request.IncluirPetRequest;
import com.projeto.hexagonal.adapters.inbound.response.IncluirPetResponse;
import com.projeto.hexagonal.application.ports.out.IncluirPetPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class IncluirPetPortImpl implements IncluirPetPort {

    @Autowired
    private PetRepository petRepository;

    @Override
    public IncluirPetResponse incluir(IncluirPetRequest request) {
        PetEntity pet = IncluirPetMapper.toEntity(request);
        pet.setDataInclusao(LocalDateTime.now());

        petRepository.save(pet);
        return IncluirPetMapper.toResponse(pet);
    }
}
