package com.projeto.hexagonal.application.entity;


import com.projeto.hexagonal.core.domain.Tamanho;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PetEntity {
    private Long id;
    private String nome;
    private String responsavel;
    private LocalDateTime dataInclusao;
    private Tamanho tamanho;
    private boolean premium;

}
