package com.projeto.hexagonal.core.ports;

import com.projeto.hexagonal.application.presentation.response.PetResponse;

public interface BuscarPetPorIdService {

    PetResponse buscarPetPorId(Long id);
}
