package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Estado;

public class EstadoDTO {
    Long id;
    String nome;
    String pais;

    public EstadoDTO(Long id, String nome, String pais) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
    }
    public EstadoDTO() {

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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static EstadoDTO toDTO (Estado estado){
        EstadoDTO dto = new EstadoDTO();
        dto.setId(estado.getId());
        dto.setNome(estado.getNome());
        return dto;
    }

    public static Estado fromDTO (EstadoDTO dto){
        Estado entity = new Estado();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        return entity;
    }
}
