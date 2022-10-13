package com.projeto.hexagonal.adapters.inbound.mapper;

import com.projeto.hexagonal.adapters.inbound.entity.PetEntity;
import com.projeto.hexagonal.adapters.inbound.request.IncluirPetRequest;
import com.projeto.hexagonal.adapters.inbound.response.IncluirPetResponse;

public class IncluirPetMapper {
    public static PetEntity toEntity(IncluirPetRequest request) {
        PetEntity entity = new PetEntity();
        entity.setNome(request.getNome());
        entity.setResponsavel(request.getResponsavel());
        entity.setTamanho(request.getTamanho());
        entity.setPremium(request.isPremium());
        return entity;
    }

    public static IncluirPetResponse toResponse(PetEntity entity) {
        IncluirPetResponse response = new IncluirPetResponse();
        response.setId(entity.getId());
        response.setNome(entity.getNome());
        response.setResponsavel(entity.getResponsavel());
        response.setTamanho(entity.getTamanho());
        response.setPremium(entity.isPremium());
        return response;
    }

}
