package com.projeto.hexagonal.application.presentation.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
public class AtualizarPetRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String responsavel;
}
