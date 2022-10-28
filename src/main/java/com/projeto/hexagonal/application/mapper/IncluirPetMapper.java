package com.projeto.hexagonal.application.mapper;

import com.projeto.hexagonal.application.entity.PetEntity;
import com.projeto.hexagonal.application.presentation.request.IncluirPetRequest;
import com.projeto.hexagonal.core.domain.Pet;

public class IncluirPetMapper {
    public static PetEntity toEntity(Pet pet) {
        PetEntity entity = new PetEntity();
        entity.setNome(pet.getNome());
        entity.setResponsavel(pet.getResponsavel());
        entity.setDataInclusao(pet.getDataInclusao());
        entity.setTamanho(pet.getTamanho());
        entity.setPremium(pet.isPremium());
        return entity;
    }

    public static Pet entityToPet(PetEntity entity) {
        Pet pet = new Pet();
        pet.setId(entity.getId());
        pet.setNome(entity.getNome());
        pet.setResponsavel(entity.getResponsavel());
        pet.setDataInclusao(entity.getDataInclusao());
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
