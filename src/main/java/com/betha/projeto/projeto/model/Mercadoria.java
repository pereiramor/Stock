package com.betha.projeto.projeto.model;

import com.betha.projeto.projeto.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Mercadoria extends AbstractEntity {

    @NotNull(message = "Não é possível validar sem o nome informado!")
    @Column(name="nome")
    private String nome;
    //@Size(max = 55, min = 2, message = "A altura informada é inválida!")
    @Column(name="altura")
    private Double altura;
    //@Size(max = 200, min = 5, message = "O peso informada é inválida!")
    @Column(name="peso")
    private Double peso;
    @Digits(integer = 3, fraction = 2, message = "O valor unitário não pode ultrapassar 2 digitos depois da virgula!")
    @Column(name="Valor_Unitario")
    private Double valorUnitario;
    @Column (name = "Pagamento")
    private Pagamento pagamento;

    public Mercadoria(){

    }

    public Mercadoria(Long id, String nome, Double altura, Double peso, Double valorUnitario) {
        super.setId(id);
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.valorUnitario = valorUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
