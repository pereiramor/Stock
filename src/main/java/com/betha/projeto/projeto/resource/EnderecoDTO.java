package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Cidade;
import com.betha.projeto.projeto.model.Endereco;

public class EnderecoDTO {
    private String id;
    private String nome;
    private int numerocasa;
    private String nomerua;
    private Cidade cidade;

    public EnderecoDTO() {

    }

    public EnderecoDTO(String id, String nome, int numerocasa, String nomerua, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.numerocasa = numerocasa;
        this.nomerua = nomerua;
        this.cidade = cidade;
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

    public int getNumerocasa() {
        return numerocasa;
    }

    public void setNumerocasa(int numerocasa) {
        this.numerocasa = numerocasa;
    }

    public String getNomerua() {
        return nomerua;
    }

    public void setNomerua(String nomerua) {
        this.nomerua = nomerua;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public static EnderecoDTO toDTO (Endereco endereco){
        EnderecoDTO dto = new EnderecoDTO();
        dto.setId(endereco.getId().toString());
        dto.setCidade(endereco.getCidade());
        dto.setNomerua(endereco.getNomerua());
        dto.setNumerocasa(endereco.getNumerocasa());


        return dto;
    }

    public static Endereco fromDTO (EnderecoDTO dto){
        Endereco entity = new Endereco();
        entity.setId(Long.getLong(dto.getId()));
        entity.setCidade(dto.getCidade());
        entity.setNumerocasa(dto.getNumerocasa());
        entity.setNomerua(dto.getNomerua());


        return entity;
    }
}
