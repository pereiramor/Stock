package com.betha.projeto.projeto.resource;

public class FornecedorDTO {
    Long id;
    String nome;
    String cnpj;
    String enderecos;
    String telefone;

    public FornecedorDTO(Long id, String nome, String cnpj, String enderecos, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.enderecos = enderecos;
        this.telefone = telefone;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(String enderecos) {
        this.enderecos = enderecos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
