package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Fornecedor;

public class FornecedorDTO {
    private String id;
    private String nome;
    private String cnpj;
    private EnderecoDTO enderecos;
    private String telefone;

    public FornecedorDTO(String id, String nome, String cnpj, EnderecoDTO enderecos, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.enderecos = enderecos;
        this.telefone = telefone;
    }

    public  FornecedorDTO (){

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public EnderecoDTO getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(EnderecoDTO enderecos) {
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
        dto.setEnderecos(EnderecoDTO.toDTO(fornecedor.getEnderecos()));
        dto.setTelefone(fornecedor.getTelefone());

        return dto;
    }

    public static Fornecedor fromDTO(FornecedorDTO dto){
        Fornecedor entity = new Fornecedor ();
        entity.setId(Long.getLong(dto.getId()));
        entity.setEnderecos(EnderecoDTO.fromDTO(dto.getEnderecos()));
        entity.setNome(dto.getNome());
        entity.setCnpj(dto.getCnpj());
        entity.setTelefone(dto.getTelefone());

        return entity;
    }
}
