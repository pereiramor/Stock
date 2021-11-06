package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Pais;

public class PaisDTO {
    Long id;
    String name;
    Double populacao;

    public PaisDTO(Long id, String name, Double populacao) {
        this.id = id;
        this.name = name;
        this.populacao = populacao;
    }

    public PaisDTO (){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }

    public static PaisDTO toDTO(Pais pais){
        PaisDTO dto = new PaisDTO();
        dto.setId(pais.getId());
        dto.setPopulacao(pais.getPopulacao());

        return dto;
    }

    public static Pais fromDTO(PaisDTO dto){
        Pais entity = new Pais();
        entity.setId(dto.getId());
        entity.setNome(dto.getName());
        entity.setPopulacao(dto.getPopulacao());

        return entity;
        }
}