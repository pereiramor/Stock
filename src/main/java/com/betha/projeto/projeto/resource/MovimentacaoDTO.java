package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Estoque;
import com.betha.projeto.projeto.model.Mercadoria;
import com.betha.projeto.projeto.model.Movimentacao;
import com.betha.projeto.projeto.model.TipoMovimentacao;

public class MovimentacaoDTO {
    Integer numero;
    TipoMovimentacao tipo;
    MercadoriaDTO mercadoria;
    Double quantidade;
    EstoqueDTO estoque;

    public MovimentacaoDTO(int numero, TipoMovimentacao tipo, MercadoriaDTO mercadoria, Double quantidade, EstoqueDTO estoque) {
        this.numero = numero;
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

    public MercadoriaDTO getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(MercadoriaDTO mercadoria) {
        this.mercadoria = mercadoria;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public EstoqueDTO getEstoque() {
        return estoque;
    }

    public void setEstoque(EstoqueDTO estoque) {
        this.estoque = estoque;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public static MovimentacaoDTO toDTO(Movimentacao movimentacao){
        MovimentacaoDTO dto = new MovimentacaoDTO();
       dto.setTipo(movimentacao.getTipo());
       dto.setMercadoria(MercadoriaDTO.toDTO(movimentacao.getMercadoria()));
       dto.setQuantidade(movimentacao.getQuantidade());
       dto.setEstoque(EstoqueDTO.toDTO(movimentacao.getEstoque()));
       dto.setNumero(movimentacao.getNumero());

        return dto;
    }

    public static Movimentacao fromDTO(MovimentacaoDTO dto){
        Movimentacao entity = new Movimentacao ();
        entity.setTipo(dto.getTipo());
        entity.setMercadoria(MercadoriaDTO.fromDTO(dto.getMercadoria()));
        entity.setQuantidade(dto.getQuantidade());
        entity.setEstoque(EstoqueDTO.fromDTO(dto.getEstoque()));
        entity.setNumero(dto.getNumero());

        return entity;
    }
}
