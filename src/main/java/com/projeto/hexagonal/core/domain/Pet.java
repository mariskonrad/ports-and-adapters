package com.projeto.hexagonal.core.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Pet {
    private Long id;
    private String nome;
    private String responsavel;
    private LocalDateTime dataInclusao;
    private Tamanho tamanho;
    private boolean premium;
}
