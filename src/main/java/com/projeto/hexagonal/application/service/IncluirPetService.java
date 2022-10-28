package com.projeto.hexagonal.application.service;

import com.projeto.hexagonal.application.presentation.request.IncluirPetRequest;

public interface IncluirPetService {
    public void incluirNovoPet(IncluirPetRequest petRequest);
}
