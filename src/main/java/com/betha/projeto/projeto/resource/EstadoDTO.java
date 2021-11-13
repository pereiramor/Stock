package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Estado;

public class EstadoDTO {
    private Long id;
    private String nome;
    private PaisDTO pais;

    public EstadoDTO(){

    }
    public EstadoDTO(Long id, String nome, PaisDTO pais) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
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

    public PaisDTO getPais() {
        return pais;
    }

    public void setPais(PaisDTO pais) {
        this.pais = pais;
    }

    public static EstadoDTO toDTO(Estado estado){
        EstadoDTO dto = new EstadoDTO();
        dto.setId(estado.getId());
        dto.setNome(estado.getNome());
        dto.setPais(estado.getPais() != null ? PaisDTO.toDTO(estado.getPais()) : null);

        return dto;
}

    public static Estado fromDTO(EstadoDTO dto){
        Estado entity = new Estado ();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        //entity.setPais(dto.getPais();
        return entity;
}
}