package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Cidade;

public class CidadeDTO {
    private Long id;
    private String nome;
    private  EstadoDTO estado;

    public CidadeDTO(){

    }
    public CidadeDTO(Long id, String nome,EstadoDTO estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
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

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    public static CidadeDTO toDTO (Cidade cidade){
        CidadeDTO dto = new CidadeDTO();
        dto.setId(cidade.getId());
        dto.setNome(cidade.getNome());
        dto.setEstado(cidade.getEstado() != null ? EstadoDTO.toDTO(cidade.getEstado()) : null);
        return dto;
    }

    public static Cidade fromDTO (CidadeDTO dto){
        Cidade entity = new Cidade();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        return entity;
    }
}
