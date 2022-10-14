package com.projeto.hexagonal.adapters.inbound.mapper;

import com.projeto.hexagonal.adapters.inbound.entity.PetEntity;
import com.projeto.hexagonal.adapters.inbound.request.IncluirPetRequest;
import com.projeto.hexagonal.application.core.domain.Pet;

public class IncluirPetMapper {
    public static PetEntity toEntity(Pet pet) {
        PetEntity entity = new PetEntity();
        entity.setNome(pet.getNome());
        entity.setResponsavel(pet.getResponsavel());
        entity.setTamanho(pet.getTamanho());
        entity.setPremium(pet.isPremium());
        return entity;
    }

    public static Pet toPet(PetEntity entity) {
        Pet pet = new Pet();
        pet.setId(entity.getId());
        pet.setNome(entity.getNome());
        pet.setResponsavel(entity.getResponsavel());
        pet.setTamanho(entity.getTamanho());
        pet.setPremium(entity.isPremium());
        return pet;
    }

    public static Pet requestToPet(IncluirPetRequest petRequest) {
        var pet = new Pet();
        pet.setNome(petRequest.getNome());
        pet.setResponsavel(petRequest.getResponsavel());
        pet.setTamanho(petRequest.getTamanho());
        pet.setPremium(petRequest.isPremium());
        return pet;
    }

}
