package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Pais;
import com.betha.projeto.projeto.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

        @RestController
        @RequestMapping("/api/paises")
        public class PaisController {


        @Autowired
        private PaisRepository repository;

        @GetMapping
        public List<Pais> getPaises() {

            return repository.findAll();
        }

        @GetMapping("/{id}")
        public Pais getpaisesId(@PathVariable(value = "id") Long paisId, @RequestBody Pais pais) throws EntityNotFoundException {
            Pais paisFind = repository.findById(paisId).orElseThrow(() ->new EntityNotFoundException("Pais não encontrado com ID::" +paisId));
            return paisFind;
        }

        @PostMapping
        public Pais create(@RequestBody Pais pais) {

            return repository.save(pais);
        }

        @PutMapping("/{id}")
        public Pais update(@PathVariable(value = "id") Long paisId, @RequestBody Pais pais) throws EntityNotFoundException {
            Pais paisFind = repository.findById(paisId).orElseThrow(() -> new EntityNotFoundException("Pais não encontrada com 10::  "+paisId));
            paisFind.setId(pais.getId());
            paisFind.setNome(pais.getNome());

            return repository.save(paisFind);

        }

        @DeleteMapping("/{id}")
        public ResponseEntity delete(@PathVariable(value = "id") Long id) throws EntityNotFoundException {
            Pais paisFind = repository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Pais não encontrado com ID::" + id));

            repository.delete(paisFind);
            return ResponseEntity.noContent().build();
        }
}
