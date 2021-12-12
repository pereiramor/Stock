package com.betha.projeto.projeto.enterprise;

import com.betha.projeto.projeto.model.Endereco;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@MappedSuperclass
public abstract class AbstractPessoa extends AbstractEntity{

    @Column(name="nome")
    @NotNull
    private String nome;
    @JoinColumn(name="I_enderecos", referencedColumnName = "ID")
    @ManyToOne
    private Endereco enderecos;
    @Column(name="telefone")
    private String telefone;

    public AbstractPessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco enderecos) {
        this.enderecos = enderecos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "AbstractPessoa{" +
                "nome='" + nome + '\'' +
                ", enderecos=" + enderecos +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
