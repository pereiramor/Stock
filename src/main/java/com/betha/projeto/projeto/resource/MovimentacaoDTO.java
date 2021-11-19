package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Estoque;
import com.betha.projeto.projeto.model.Mercadoria;
import com.betha.projeto.projeto.model.Movimentacao;
import com.betha.projeto.projeto.model.TipoMovimentacao;

public class MovimentacaoDTO {
    TipoMovimentacao tipo;
    Mercadoria mercadoria;
    Double quantidade;
    Estoque estoque;

    public MovimentacaoDTO(TipoMovimentacao tipo, Mercadoria mercadoria, Double quantidade, Estoque estoque) {
        this.tipo = tipo;
        this.mercadoria = mercadoria;
        this.quantidade = quantidade;
        this.estoque = estoque;
    }

    public MovimentacaoDTO (){

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

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    public static MovimentacaoDTO toDTO(Movimentacao movimentacao){
        MovimentacaoDTO dto = new MovimentacaoDTO();
       dto.setTipo(movimentacao.getTipo());
       dto.setMercadoria(movimentacao.getMercadoria());
       dto.setQuantidade(movimentacao.getQuantidade());
       dto.setEstoque(movimentacao.getEstoque());

        return dto;
    }

    public static Movimentacao fromDTO(MovimentacaoDTO dto){
        Movimentacao entity = new Movimentacao ();
        entity.setTipo(dto.getTipo());
        entity.setMercadoria(dto.getMercadoria());
        entity.setQuantidade(dto.getQuantidade());
        entity.setEstoque(dto.getEstoque());

        return entity;
    }
}
