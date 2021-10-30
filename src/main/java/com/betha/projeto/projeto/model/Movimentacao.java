package com.betha.projeto.projeto.model;

import com.betha.projeto.projeto.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Movimentacao extends AbstractEntity {
    @Column(name="Tipo_de_movimentacao")
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "I_MERCADORIA",referencedColumnName = "ID")
    private Mercadoria mercadoria;
    @Column(name="quantidade")
    private Double quantidade;
    @Column (name = "Pagamento")
    private Pagamento pagamento;


    public Movimentacao() {
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMercadoria() {
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
}
