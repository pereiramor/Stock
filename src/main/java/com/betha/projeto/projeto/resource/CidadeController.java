package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Cidade;
import com.betha.projeto.projeto.repository.CidadeRepository;
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
import java.util.stream.Collectors;

@RestController
@RequestMapping ("/api/cidades")
public class CidadeController {

    @Autowired
    private CidadeRepository repository;

    @GetMapping
    public List<CidadeDTO> getCidades() {

        return repository.findAll().stream().map(c -> CidadeDTO.toDTO(c)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Cidade getCidadesId(@PathVariable(value = "id") Long cidadeId, @RequestBody Cidade cidade) throws EntityNotFoundException {
        Cidade cidadeFind = repository.findById(cidadeId).orElseThrow(() ->new EntityNotFoundException("Cidade não encontrado com ID::" +cidadeId));
        return cidadeFind;
    }

    @PostMapping
    public Cidade create(@RequestBody Cidade cidade) {
        return repository.save(cidade);
    }

    @PutMapping("/{id}")
    public Cidade update(@PathVariable(value = "id") Long cidadeId, @RequestBody Cidade cidade) throws EntityNotFoundException {
        Cidade cidadeFind = repository.findById(cidadeId).orElseThrow(() -> new EntityNotFoundException("Cidade não encontrada com 10::  "+cidadeId));
        cidadeFind.setId(cidade.getId());
        cidadeFind.setNome(cidade.getNome());

        return repository.save(cidadeFind);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) throws EntityNotFoundException {
        Cidade cidadeFind = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cidade não encontrada com ID::" + id));

        repository.delete(cidadeFind);
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
