package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Endereco;
import com.betha.projeto.projeto.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping ("/api/enderecos/")
public class EnderecoController {

    @Autowired
    private EnderecoRepository repository;

    @GetMapping
    public List<Endereco> getEnderecos() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
        public Endereco getEnderecosId(@PathVariable(value = "id") Long enderecoId, @RequestBody Endereco endereco) throws EntityNotFoundException {
            Endereco enderecoFind = repository.findById(enderecoId).orElseThrow(() ->new EntityNotFoundException("Endereco não encontrado com ID::" +enderecoId));
            return enderecoFind;
        }


    @PostMapping
    public Endereco create(@RequestBody Endereco endereco) {
        return repository.save(endereco);
    }

    @PutMapping("/{id}")
    public Endereco update(@PathVariable(value = "id") Long enderecoId, @RequestBody Endereco endereco) throws EntityNotFoundException {
        Endereco enderecoFind = repository.findById(enderecoId).orElseThrow(() -> new EntityNotFoundException("Endereco não encontrado com ID::  "+enderecoId));
        enderecoFind.setId(endereco.getId());
        enderecoFind.setCidade(endereco.getCidade());
        enderecoFind.setNomerua(endereco.getNomerua());
        enderecoFind.setNumerocasa(endereco.getNumerocasa());

        return repository.save(enderecoFind);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) throws EntityNotFoundException {
        Endereco enderecoFind = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Endereco não encontrado com ID::" + id));

        repository.delete(enderecoFind);
        return ResponseEntity.noContent().build();
    }
}
