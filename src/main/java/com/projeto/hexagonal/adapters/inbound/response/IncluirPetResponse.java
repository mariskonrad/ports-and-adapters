package com.projeto.hexagonal.adapters.inbound.response;

import com.projeto.hexagonal.application.core.domain.Tamanho;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class IncluirPetResponse {
    private Long id;
    private String nome;
    private String responsavel;
    private Tamanho tamanho;
    private boolean premium;
}
