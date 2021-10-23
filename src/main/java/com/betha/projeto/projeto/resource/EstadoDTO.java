package com.betha.projeto.projeto.resource;

public class EstadoDTO {
    String id;
    String nome;
    String pais;

    public EstadoDTO(String id, String nome, String pais) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
