package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Estoque;
import com.betha.projeto.projeto.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/api/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueRepository repository;

    @GetMapping
    public List<Estoque> getEstoques() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Estoque getEstoquesId(@PathVariable(value = "id") Long estoqueId) throws EntityNotFoundException {
        Estoque estoqueFind = repository.findById(estoqueId).orElseThrow(() ->new EntityNotFoundException("Estoque não encontrado com ID::" +estoqueId));
        return estoqueFind;
    }


    @PostMapping
    public Estoque create(@RequestBody Estoque estoque) {
        return repository.save(estoque);
    }

    @PutMapping("/{id}")
    public Estoque update(@PathVariable(value = "id") Long estoqueId, @RequestBody Estoque estoque) throws EntityNotFoundException {
        Estoque estoqueFind = repository.findById(estoqueId).orElseThrow(() -> new EntityNotFoundException("Estoque não encontrado com ID::  "+estoqueId));
       estoqueFind.setDescricao(estoque.getDescricao());

        return repository.save(estoqueFind);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) throws EntityNotFoundException {
        Estoque estoqueFind = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Estoque não encontrado com ID::" + id));

        repository.delete(estoqueFind);
        return ResponseEntity.noContent().build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
