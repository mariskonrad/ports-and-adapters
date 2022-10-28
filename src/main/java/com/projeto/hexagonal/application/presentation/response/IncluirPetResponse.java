package com.projeto.hexagonal.application.presentation.response;

import com.projeto.hexagonal.core.domain.Tamanho;
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
