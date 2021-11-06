package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Cidade;

public class CidadeDTO {
    private Long id;
    private String nome;

    public CidadeDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static CidadeDTO toDTO (Cidade cidade){
        CidadeDTO dto = new CidadeDTO();
        dto.setId(cidade.getId());
        dto.setNome(cidade.getNome());
        return dto;
    }

    public static Cidade fromDTO (CidadeDTO dto){
        Cidade entity = new Cidade();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        return entity;
    }
}
