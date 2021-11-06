package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Cidade;
import com.betha.projeto.projeto.model.Fornecedor;
import com.betha.projeto.projeto.repository.CidadeRepository;
import com.betha.projeto.projeto.repository.FornecedorRepository;
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
    @RequestMapping("/api/fornecedores")
    public class FornecedorController {
    @Autowired
    private FornecedorRepository repository;

    @GetMapping
    public List<Fornecedor> getCidades() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Fornecedor getFornecedoresId(@PathVariable(value = "id") Long fornecedorId, @RequestBody Fornecedor fornecedor) throws EntityNotFoundException {
        Fornecedor fornecedorFind = repository.findById(fornecedorId).orElseThrow(() ->new EntityNotFoundException("Fornecedor não encontrado com ID::" +fornecedorId));
        return fornecedorFind;
    }

    @PostMapping
    public Fornecedor create(@RequestBody Fornecedor fornecedor) {
        return repository.save(fornecedor);
    }

    @PutMapping("/{id}")
    public Fornecedor update(@PathVariable(value = "id") Long fornecedorId, @RequestBody Fornecedor fornecedor) throws EntityNotFoundException {
        Fornecedor fornecedorFind = repository.findById(fornecedorId).orElseThrow(() -> new EntityNotFoundException("Fornecedor não encontrado com ID::  "+fornecedorId));
        fornecedorFind.setId(fornecedor.getId());
        fornecedorFind.setNome(fornecedor.getNome());
        fornecedorFind.setCnpj(fornecedor.getCnpj());
        fornecedorFind.setTelefone(fornecedor.getTelefone());

        return repository.save(fornecedorFind);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) throws EntityNotFoundException {
        Fornecedor fornecedorFind = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Fornecedor não encontrado com ID::" + id));

        repository.delete(fornecedorFind);
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
