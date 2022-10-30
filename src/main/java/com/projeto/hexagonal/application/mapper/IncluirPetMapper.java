package com.projeto.hexagonal.application.mapper;

import com.projeto.hexagonal.application.entity.PetEntity;
import com.projeto.hexagonal.application.presentation.request.IncluirPetRequest;
import com.projeto.hexagonal.core.domain.Pet;

public class IncluirPetMapper {
    public static PetEntity toEntity(Pet pet) {
        return PetEntity.builder()
                .id(pet.getId())
                .nome(pet.getNome())
                .responsavel(pet.getResponsavel())
                .dataInclusao(pet.getDataInclusao())
                .tamanho(pet.getTamanho())
                .premium(pet.isPremium())
                .build();
    }

    public static Pet requestToPet(IncluirPetRequest petRequest) {
        return Pet.builder()
                .nome(petRequest.getNome())
                .responsavel(petRequest.getResponsavel())
                .tamanho(petRequest.getTamanho())
                .premium(petRequest.isPremium())
                .build();
    }
}
