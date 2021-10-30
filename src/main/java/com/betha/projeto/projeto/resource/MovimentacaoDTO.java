package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Mercadoria;
import com.betha.projeto.projeto.model.Movimentacao;

public class MovimentacaoDTO {
    String tipo;
    String mercadoria;
    Double quantidade;

    public MovimentacaoDTO(String tipo, String mercadoria, Double quantidade) {
        this.tipo = tipo;
        this.mercadoria = mercadoria;
        this.quantidade = quantidade;
    }

    public MovimentacaoDTO (){

    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Mercadoria getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    public static MovimentacaoDTO toDTO(Movimentacao movimentacao){
        MovimentacaoDTO dto = new MovimentacaoDTO();
        dto.setTipo(movimentacao.getTipo());
        dto.setMercadoria(movimentacao.getMercadoria());
        dto.setQuantidade(movimentacao.getQuantidade());

        return dto;
    }

    public static Movimentacao fromDTO(MovimentacaoDTO dto){
        Movimentacao entity = new Movimentacao ();
        entity.setTipo(dto.getTipo());
        entity.setMercadoria(dto.getMercadoria());
        entity.setQuantidade(dto.getQuantidade());

        return entity;
    }
}
