package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Fornecedor;
import com.betha.projeto.projeto.model.Mercadoria;

public class MercadoriaDTO {
   public String id;
   public String nome;
   public Double altura;
   public Double peso;
   public Double valorUnitario;

    public MercadoriaDTO(String id, String nome, Double altura, Double peso, Double valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.valorUnitario = valorUnitario;
    }

    public  MercadoriaDTO (){

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public static MercadoriaDTO toDTO(Mercadoria mercadoria){
        MercadoriaDTO dto = new MercadoriaDTO();
        dto.setId(mercadoria.getId().toString());
        dto.setNome(mercadoria.getNome());
        dto.setAltura(mercadoria.getAltura());
        dto.setPeso(mercadoria.getPeso());
        dto.setValorUnitario(mercadoria.getValorUnitario());

        return dto;
    }

    public static Mercadoria fromDTO(MercadoriaDTO dto){
        Mercadoria entity = new Mercadoria ();
        entity.setId(Long.getLong(dto.getId()));
        entity.setNome(dto.getNome());
        entity.setAltura(dto.getAltura());
        entity.setPeso(dto.getPeso());
        entity.setValorUnitario(dto.getValorUnitario());

        return entity;
    }
}
