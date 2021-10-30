package com.betha.projeto.projeto.model;

import com.betha.projeto.projeto.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Pais extends AbstractEntity {
    @Column(name="name")
    private String nome;
    @Column(name="populacao")
    private Double populacao;

    public Pais(){

    }

    public Pais(Long id, String nome, Double populacao) {
       super.setId(id);
        this.nome = nome;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }
}
