package com.projeto.hexagonal.application.service;

import com.projeto.hexagonal.application.entity.PetEntity;
import com.projeto.hexagonal.application.infrastructure.IncluirPetRepository;
import com.projeto.hexagonal.core.domain.Pet;
import com.projeto.hexagonal.core.ports.IncluirPetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Objects;

import static com.projeto.hexagonal.application.mapper.IncluirPetMapper.toEntity;

@Service
public class IncluirPetServiceImpl implements IncluirPetService {

    private final IncluirPetRepository incluirPetRepository;

    public IncluirPetServiceImpl(IncluirPetRepository incluirPetRepository) {
        this.incluirPetRepository = incluirPetRepository;
    }

    @Transactional
    public void incluirNovoPet(Pet pet) {
        PetEntity petEntity = toEntity(pet);
        petEntity.setDataInclusao(LocalDateTime.now());
        Long petId;
        if (Objects.isNull(pet.getId())) {
            petId = incluirPetRepository.incluirNovoPet(petEntity);
            petEntity.setId(petId);
        }
    }
}
