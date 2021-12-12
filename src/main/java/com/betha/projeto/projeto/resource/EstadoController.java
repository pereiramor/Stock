package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Estado;
import com.betha.projeto.projeto.repository.EstadoRepository;
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
@RequestMapping("/api/estados")
public class EstadoController {

    @Autowired
    private EstadoRepository repository;

    @GetMapping
    public List<Estado> getEstados() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public EstadoDTO getEstadosId(@PathVariable(value = "id") Long estadoId) throws EntityNotFoundException {
        Estado estadoFind = repository.findById(estadoId).orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com ID::" + estadoId));
        return EstadoDTO.toDTO(estadoFind);
    }

    @PostMapping
    public Estado create(@RequestBody Estado estado) {
        return repository.save(estado);
    }

    @PutMapping("/{id}")
    public Estado update(@PathVariable(value = "id") Long estadoId, @RequestBody Estado estado) throws EntityNotFoundException {
        Estado estadoFind = repository.findById(estadoId).orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com ID::  " + estadoId));
        estadoFind.setNome(estado.getNome());
        estadoFind.setPais(estado.getPais());

        return repository.save(estadoFind);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) throws EntityNotFoundException {
        Estado estadoFind = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com ID::" + id));

        repository.delete(estadoFind);
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

