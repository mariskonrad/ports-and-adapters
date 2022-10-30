package com.projeto.hexagonal.application.mapper;

import com.projeto.hexagonal.application.presentation.response.ListarPetResponse;
import com.projeto.hexagonal.core.domain.Pet;

public class ListarPetMapper {
    public static ListarPetResponse toResponse(Pet pet) {
        return ListarPetResponse.builder()
                .id(pet.getId())
                .nome(pet.getNome())
                .responsavel(pet.getResponsavel())
                .dataInclusao(pet.getDataInclusao())
                .tamanho(pet.getTamanho())
                .premium(pet.isPremium())
                .build();
    }
}
