package com.betha.projeto.projeto.model;

import com.betha.projeto.projeto.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Movimentacao extends AbstractEntity {
    @Column(name = "Numero")
    private Integer numero;
    @Column(name="Tipo_de_movimentacao")
    private TipoMovimentacao tipo;
    @ManyToOne
    @JoinColumn(name = "I_MERCADORIA",referencedColumnName = "ID")
    private Mercadoria mercadoria;
    @Column(name="quantidade")
    private Double quantidade;
    @ManyToOne
    @JoinColumn(name = "I_ESTOQUE", referencedColumnName = "ID")
    private Estoque estoque;



    public Movimentacao() {
    }

    public TipoMovimentacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimentacao tipo) {
        this.tipo = tipo;
    }

    public Mercadoria getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(Mercadoria mercadoria) {
        this.mercadoria = mercadoria;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
