package com.projeto.hexagonal.application.mapper;

import com.projeto.hexagonal.application.presentation.response.PetResponse;
import com.projeto.hexagonal.core.domain.Pet;

public class BuscarPorIdPetMapper {
    public static PetResponse toResponse(Pet pet) {
        return PetResponse.builder()
                .id(pet.getId())
                .nome(pet.getNome())
                .responsavel(pet.getResponsavel())
                .dataInclusao(pet.getDataInclusao())
                .tamanho(pet.getTamanho())
                .premium(pet.isPremium())
                .build();
    }
}
