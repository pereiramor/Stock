package com.betha.projeto.projeto.model;

import com.betha.projeto.projeto.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.List;

@Entity
public class Estoque extends AbstractEntity {

    @Column(name="descricao")
    private String descricao;
   //@Transient
    //private List<Movimentacao> movimentacoes;
   @Column(name="nome")
   private String nome;

   public Estoque(){

   }

    public Estoque(String descricao, List<Movimentacao> movimentacoes, String nome) {
        this.descricao = descricao;
        //this.movimentacoes = movimentacoes;
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
