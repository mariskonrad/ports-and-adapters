package com.projeto.hexagonal.application.ports.out;

import com.projeto.hexagonal.application.core.domain.Pet;

public interface IncluirPetPort {
    Pet incluir(Pet pet);
}
