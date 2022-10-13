package com.projeto.hexagonal.application.ports.in;

import com.projeto.hexagonal.application.core.domain.Pet;

public interface IncluirPetServicePort {
    Pet incluirPet(Pet pet);
}
