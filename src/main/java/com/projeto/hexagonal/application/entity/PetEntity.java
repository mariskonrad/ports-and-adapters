package com.projeto.hexagonal.application.entity;

import com.projeto.hexagonal.core.domain.Tamanho;

import java.time.LocalDateTime;

public class PetEntity {
    private Long id;
    private String nome;
    private String responsavel;

    public PetEntity(Long id, String nome, String responsavel, LocalDateTime dataInclusao, Tamanho tamanho, boolean premium) {
        this.id = id;
        this.nome = nome;
        this.responsavel = responsavel;
        this.dataInclusao = dataInclusao;
        this.tamanho = tamanho;
        this.premium = premium;
    }

    public PetEntity() {
        this.setId(null);
        this.setNome("");
        this.setResponsavel(null);
        this.setDataInclusao(null);
        this.setTamanho(null);
        this.setPremium(false);
    }

    private LocalDateTime dataInclusao;

    private Tamanho tamanho;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public LocalDateTime getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDateTime dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    private boolean premium;

}
