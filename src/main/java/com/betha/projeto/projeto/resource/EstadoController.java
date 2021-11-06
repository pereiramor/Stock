package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Estado;
import com.betha.projeto.projeto.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/estados")
public class EstadoController {

    @Autowired
    private EstadoRepository repository;

    @GetMapping
    public List<Estado> getEstados() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Estado getEstadosId(@PathVariable(value = "id") Long estadoId, @RequestBody Estado estado) throws EntityNotFoundException {
        Estado estadoFind = repository.findById(estadoId).orElseThrow(() ->new EntityNotFoundException("Estado não encontrado com ID::" +estadoId));
        return estadoFind;
    }

    @PostMapping
    public Estado create(@RequestBody Estado estado) {
        return repository.save(estado);
    }

    @PutMapping("/{id}")
    public Estado update(@PathVariable(value = "id") Long estadoId, @RequestBody Estado estado) throws EntityNotFoundException {
       Estado estadoFind = repository.findById(estadoId).orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com ID::  "+estadoId));
        estadoFind.setNome(estado.getNome());

        return repository.save(estadoFind);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) throws EntityNotFoundException {
        Estado estadoFind = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com ID::" + id));

        repository.delete(estadoFind);
        return ResponseEntity.noContent().build();
    }

}
