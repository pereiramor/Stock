package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Estoque;

public class EstoqueDTO {
    Long id;
    String descricao;

    public EstoqueDTO(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public EstoqueDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public static EstoqueDTO toDTO (Estoque estoque){
        EstoqueDTO dto = new EstoqueDTO();
        dto.setId(estoque.getId());
        return dto;
    }

    public static Estoque fromDTO (EstoqueDTO dto){
        Estoque entity = new Estoque();
        entity.setId(dto.getId());
        return entity;
    }
}
