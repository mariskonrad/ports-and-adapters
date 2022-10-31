package com.projeto.hexagonal.application.presentation.request;

import com.projeto.hexagonal.core.domain.Tamanho;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
@Builder
public class IncluirPetRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String responsavel;
    private Tamanho tamanho;
    private boolean premium;
}
