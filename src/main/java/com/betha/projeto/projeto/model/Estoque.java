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
   @Transient
    private List<Movimentacao> movimentacoes;

   public Estoque(){

   }

    public Estoque(Long id, String descricao) {
        super.setId(id);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
