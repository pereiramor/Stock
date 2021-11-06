package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Endereco;

public class EnderecoDTO {
    private Long id;
    private String nome;

    public EnderecoDTO() {

    }

   public EnderecoDTO(String cpf, String nome) {
       this.id = id;
       this.nome = nome;
   }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public String SetNome() {

       return nome;
    }
    public static EnderecoDTO toDTO (Endereco endereco){
        EnderecoDTO dto = new EnderecoDTO();
        dto.setId(endereco.getId());
        return dto;
    }

    public static Endereco fromDTO (EnderecoDTO dto){
        Endereco entity = new Endereco();
        entity.setId(dto.getId());
        return entity;
    }
}
