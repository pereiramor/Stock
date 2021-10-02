package com.betha.projeto.projeto.model;


import com.betha.projeto.projeto.enterprise.AbstractPessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Cliente extends AbstractPessoa {
    @Column(name="cpf")
    private String cpf;
    @Column(name="email")
    private String email;
    @Column(name="rg")
    private String rg;

    public Cliente(){

    }
    public Cliente(Long id, String nome, String cpf, List<Endereco> enderecos, String email, String rg) {
        super.setId(id);
        super.setNome(nome);
        this.cpf = cpf;
        super.setEnderecos(enderecos);
        this.email = email;
        this.rg = rg;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
