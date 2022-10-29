package com.projeto.hexagonal.core.ports;

import com.projeto.hexagonal.core.domain.Pet;

public interface IncluirPetService {
    public void incluirNovoPet(Pet pet);
}
