package com.projeto.hexagonal.application.mapper;

import com.projeto.hexagonal.application.presentation.request.IncluirPetRequest;
import com.projeto.hexagonal.core.domain.Pet;

public class IncluirPetMapper {

    public static Pet requestToPet(IncluirPetRequest petRequest) {
        return Pet.builder()
                .nome(petRequest.getNome())
                .responsavel(petRequest.getResponsavel())
                .tamanho(petRequest.getTamanho())
                .premium(petRequest.isPremium())
                .build();
    }
}
