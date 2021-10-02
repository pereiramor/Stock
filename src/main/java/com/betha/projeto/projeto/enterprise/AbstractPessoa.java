package com.betha.projeto.projeto.enterprise;

import com.betha.projeto.projeto.model.Endereco;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import java.util.List;

@MappedSuperclass
public abstract class AbstractPessoa extends AbstractEntity{

    @Column(name="nome")
    @NotNull
    private String nome;
   @Transient
    private List<Endereco> enderecos;
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

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
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
