package com.projeto.hexagonal.application.service;

import com.projeto.hexagonal.application.entity.PetEntity;
import com.projeto.hexagonal.application.infrastructure.PetRepositoryJDBI;
import com.projeto.hexagonal.application.mapper.IncluirPetMapper;
import com.projeto.hexagonal.application.presentation.request.IncluirPetRequest;
import com.projeto.hexagonal.core.domain.Pet;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Objects;

import static com.projeto.hexagonal.application.mapper.IncluirPetMapper.toEntity;

@Service
public class IncluirPetService {

    private PetRepositoryJDBI petRepositoryJDBI;

    public IncluirPetService(PetRepositoryJDBI petRepositoryJDBI) {
        this.petRepositoryJDBI = petRepositoryJDBI;
    }

    @Transactional
    public void incluirNovoPet(IncluirPetRequest petRequest) {
        Pet pet = IncluirPetMapper.requestToPet(petRequest);
        PetEntity petEntity = toEntity(pet);
        petEntity.setDataInclusao(LocalDateTime.now());
        Long petId;
        if (Objects.isNull(pet.getId())) {
            petId = petRepositoryJDBI.incluirNovoPet(petEntity);
            petEntity.setId(petId);
        }
    }

    public void incluir(IncluirPetRequest petRequest) {
        Pet pet = IncluirPetMapper.requestToPet(petRequest);
    }
}
