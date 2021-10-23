package com.betha.projeto.projeto.resource;

public class MovimentacaoDTO {
    String tipo;
    String mercadoria;
    Double quantidade;

    public MovimentacaoDTO(String tipo, String mercadoria, Double quantidade) {
        this.tipo = tipo;
        this.mercadoria = mercadoria;
        this.quantidade = quantidade;
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

    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
