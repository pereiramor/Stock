package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Estoque;

public class EstoqueDTO {
    public String id;
    public String descricao;
    public String nome;

    public EstoqueDTO(String id, String descricao, String nome) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
    }

    public EstoqueDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public static EstoqueDTO toDTO (Estoque estoque){
        EstoqueDTO dto = new EstoqueDTO();
        dto.setId(estoque.getId().toString());
        dto.setDescricao(estoque.getDescricao());
        dto.setNome(estoque.getNome());
        return dto;
    }

    public static Estoque fromDTO (EstoqueDTO dto){
        Estoque entity = new Estoque();
        entity.setId(Long.getLong(dto.getId()));
        entity.setDescricao(dto.getDescricao());
        entity.setNome(dto.getNome());
        return entity;
    }
}
