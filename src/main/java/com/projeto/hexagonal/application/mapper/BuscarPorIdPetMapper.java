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

    public static Pet toPet(PetResponse petResponse) {
        return Pet.builder()
                .id(petResponse.getId())
                .nome(petResponse.getNome())
                .responsavel(petResponse.getResponsavel())
                .dataInclusao(petResponse.getDataInclusao())
                .tamanho(petResponse.getTamanho())
                .premium(petResponse.isPremium())
                .build();
    }
}
