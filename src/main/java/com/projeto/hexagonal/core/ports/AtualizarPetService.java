package com.projeto.hexagonal.core.ports;

import com.projeto.hexagonal.application.presentation.request.AtualizarPetRequest;

public interface AtualizarPetService {

    void atualizar(Long id, AtualizarPetRequest request);
}
