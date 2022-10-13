package com.projeto.hexagonal.application.ports.out;

import com.projeto.hexagonal.adapters.inbound.request.IncluirPetRequest;
import com.projeto.hexagonal.adapters.inbound.response.IncluirPetResponse;

public interface IncluirPetPort {
    IncluirPetResponse incluir(IncluirPetRequest request);
}
