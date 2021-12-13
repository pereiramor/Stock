package com.betha.projeto.projeto.resource;


import com.betha.projeto.projeto.model.Endereco;
import com.betha.projeto.projeto.repository.EnderecoRepository;
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
@RequestMapping ("/api/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoRepository repository;

    @GetMapping
    public List<Endereco> getEnderecos() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
        public EnderecoDTO getEnderecosId(@PathVariable(value = "id") Long enderecoId) throws EntityNotFoundException {
            Endereco enderecoFind = repository.findById(enderecoId).orElseThrow(() ->new EntityNotFoundException("Endereco não encontrado com ID::" +enderecoId));
        return EnderecoDTO.toDTO(enderecoFind);
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
