package com.betha.projeto.projeto.model;

import com.betha.projeto.projeto.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Endereco extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "I_CIDADES",referencedColumnName = "ID")
    private Cidade cidade;
    @Column(name="nome_da_rua")
    private String nomerua;
    @Column(name="numeroCasa")
    private int numerocasa;

    public Endereco() {

    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNomerua() {
        return nomerua;
    }

    public void setNomerua(String nomerua) {
        this.nomerua = nomerua;
    }

    public int getNumerocasa() {
        return numerocasa;
    }

    public void setNumerocasa(int numerocasa) {
        this.numerocasa = numerocasa;
    }
}
