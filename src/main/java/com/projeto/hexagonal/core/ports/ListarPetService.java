package com.projeto.hexagonal.core.ports;

import com.projeto.hexagonal.core.domain.Pet;

import java.util.List;

public interface ListarPetService {
    List<Pet> listarPets();
}
