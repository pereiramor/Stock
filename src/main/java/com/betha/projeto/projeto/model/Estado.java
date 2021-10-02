package com.betha.projeto.projeto.model;

import com.betha.projeto.projeto.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Estado extends AbstractEntity {
    @Column(name="nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "I_PAISES", referencedColumnName = "ID")
    private Pais pais;

    public Estado(){

    }
    public Estado(Long id, String nome, Pais pais) {
        super.setId(id);
        this.nome = nome;
        this.pais = pais;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
