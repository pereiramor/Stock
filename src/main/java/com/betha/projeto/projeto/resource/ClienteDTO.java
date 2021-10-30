package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Cliente;

public class ClienteDTO {
    private String cpf;
    private String nome;
    private String rg;

    public ClienteDTO(String cpf, String nome, String rg) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
    }
    public  ClienteDTO (){

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
    public static ClienteDTO toDTO(Cliente cliente){
        ClienteDTO dto = new ClienteDTO();
        dto.setCpf(cliente.getCpf());
        dto.setNome(cliente.getNome());
        dto.setRg(cliente.getRg());

        return dto;
    }

    public static Cliente fromDTO(ClienteDTO dto){
        Cliente entity = new Cliente ();
        entity.setCpf(dto.getCpf());
        entity.setNome(dto.getNome());
        entity.setRg(dto.getRg());

        return entity;
    }
}
