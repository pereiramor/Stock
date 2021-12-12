package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Cliente;
import com.betha.projeto.projeto.model.Documento;
import com.betha.projeto.projeto.model.Endereco;
import com.betha.projeto.projeto.model.Sexo;

import java.util.List;

public class ClienteDTO {
    private Long id;
    private String cpf;
    private String nome;
    private String rg;
    private String email;
    private EnderecoDTO enderecos;
    private Documento documento;
    private Sexo sexo;

    public ClienteDTO() {
    }

    public ClienteDTO(Long id, String cpf, String nome, String rg, String email, EnderecoDTO enderecos, Documento documento, Sexo sexo) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.email = email;
        this.enderecos = enderecos;
        this.documento = documento;
        this.sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoDTO getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(EnderecoDTO enderecos) {
        this.enderecos = enderecos;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public static ClienteDTO toDTO(Cliente cliente){
        ClienteDTO dto = new ClienteDTO();
        dto.setId(cliente.getId());
        dto.setCpf(cliente.getCpf());
        dto.setNome(cliente.getNome());
        dto.setRg(cliente.getRg());
        dto.setEmail(cliente.getEmail());
        dto.setEnderecos(EnderecoDTO.toDTO(cliente.getEnderecos()));
        dto.setDocumento(cliente.getDocumento());
        dto.setSexo(cliente.getSexo());

        return dto;
    }

    public static Cliente fromDTO(ClienteDTO dto){
        Cliente entity = new Cliente ();
        entity.setId(dto.getId());
        entity.setCpf(dto.getCpf());
        entity.setNome(dto.getNome());
        entity.setRg(dto.getRg());
        entity.setEmail(dto.getEmail());
        entity.setEnderecos(EnderecoDTO.fromDTO(dto.getEnderecos()));
        entity.setDocumento(dto.getDocumento());
        entity.setSexo(dto.getSexo());

        return entity;
    }
}
