package com.betha.projeto.projeto.model;

import com.betha.projeto.projeto.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
    public class Cidade extends AbstractEntity {


    @Column(name = "nome")
    private String nome;

        @ManyToOne
        @JoinColumn(name = "I_ESTADOS",referencedColumnName = "ID")
    private Estado estado;

        public Cidade(){

        }

        public Cidade(Long id, String nome, Estado estado) {
        super.setId (id);
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
