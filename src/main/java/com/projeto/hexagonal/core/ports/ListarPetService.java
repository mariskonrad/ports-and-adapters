package com.projeto.hexagonal.core.ports;

import com.projeto.hexagonal.application.presentation.response.PetResponse;

import java.util.List;

public interface ListarPetService {
    List<PetResponse> listarPets();
}
