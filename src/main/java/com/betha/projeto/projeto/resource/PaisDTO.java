package com.betha.projeto.projeto.resource;

public class PaisDTO {
    Long id;
    String name;
    String populacao;

    public PaisDTO(Long id, String name, String populacao) {
        this.id = id;
        this.name = name;
        this.populacao = populacao;
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

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }
}
