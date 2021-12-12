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
    @Column(name = "tipoDocumento")
    private Documento documento;
    @Column(name = "Sexo")
    private  Sexo sexo;
    @Column(name = "Raça")
    private Raca raca;


    public Cliente(){

    }

    public Cliente(String cpf, String email, String rg, Documento documento, Sexo sexo, Raca raca) {
        this.cpf = cpf;
        this.email = email;
        this.rg = rg;
        this.documento = documento;
        this.sexo = sexo;
        this.raca = raca;

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

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

}
