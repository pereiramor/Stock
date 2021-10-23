package com.betha.projeto.projeto.resource;

public class ClienteDTO {
    private String cpf;
    private String nome;
    private String rg;

    public ClienteDTO(String cpf, String nome, String rg) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

}
