package com.projeto.hexagonal.adapters.inbound.request;

import com.projeto.hexagonal.application.core.domain.Tamanho;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class IncluirPetRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String responsavel;
    private Tamanho tamanho;
    private boolean premium;
}
