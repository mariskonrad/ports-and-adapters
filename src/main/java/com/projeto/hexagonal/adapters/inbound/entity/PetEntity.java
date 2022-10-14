package com.projeto.hexagonal.adapters.inbound.entity;

import com.projeto.hexagonal.application.core.domain.Tamanho;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Table(name = "pet")
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String responsavel;
    private LocalDateTime dataInclusao;

    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;

    private boolean premium;
}
