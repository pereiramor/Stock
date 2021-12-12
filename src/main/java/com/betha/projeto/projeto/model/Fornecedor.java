package com.betha.projeto.projeto.model;

import com.betha.projeto.projeto.enterprise.AbstractPessoa;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Fornecedor extends AbstractPessoa {
    @Column(name="CNPJ")
    private String cnpj;
    @Column(name="numero_telefone")
    private String telefone;


    public Fornecedor(){

    }

    public Fornecedor(Long id, String nome, String cnpj, Endereco enderecos, String telefone) {
        super.setId(id);
        super.setNome(nome);
        this.cnpj = cnpj;
        super.setEnderecos(enderecos);
        this.telefone = telefone;

    }

    public String getCnpj() {

        return cnpj;
    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }


}
