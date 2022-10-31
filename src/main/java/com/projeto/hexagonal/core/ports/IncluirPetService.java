package com.projeto.hexagonal.core.ports;

import com.projeto.hexagonal.application.presentation.request.IncluirPetRequest;

public interface IncluirPetService {
    public void incluirNovoPet(IncluirPetRequest petRequest);
}
