package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Fornecedor;

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

    public  FornecedorDTO (){

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

    public static FornecedorDTO toDTO(Fornecedor fornecedor){
        FornecedorDTO dto = new FornecedorDTO();
        dto.setNome(fornecedor.getNome());
        dto.setCnpj(fornecedor.getCnpj());

        return dto;
    }

    public static Fornecedor fromDTO(FornecedorDTO dto){
        Fornecedor entity = new Fornecedor ();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setCnpj(dto.getCnpj());
        entity.setTelefone(dto.getTelefone());

        return entity;
    }
}
