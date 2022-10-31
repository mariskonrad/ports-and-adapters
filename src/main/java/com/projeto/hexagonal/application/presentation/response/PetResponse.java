package com.projeto.hexagonal.application.presentation.response;

import com.projeto.hexagonal.core.domain.Tamanho;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@Builder
public class PetResponse {
    private Long id;
    private String nome;
    private String responsavel;
    private LocalDateTime dataInclusao;
    private Tamanho tamanho;
    private boolean premium;
}
