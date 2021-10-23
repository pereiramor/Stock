package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Cidade;
import com.betha.projeto.projeto.model.Mercadoria;
import com.betha.projeto.projeto.repository.MercadoriaRepository;
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
@RequestMapping ("/api/mercadoria")
public class MercadoriaController {

    @Autowired
    private MercadoriaRepository repository;

    @GetMapping
    public List<Mercadoria> getMercadoria() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Mercadoria getMercadoriaId(@PathVariable(value = "id") Long mercadoriaId, @RequestBody Mercadoria mercadoria) throws EntityNotFoundException {
        Mercadoria mercadoriaFind = repository.findById(mercadoriaId).orElseThrow(() ->new EntityNotFoundException("Mercadoria não encontrado com ID:" +mercadoriaId));
        return mercadoriaFind;
    }

    @PostMapping
    public Mercadoria create(@RequestBody Mercadoria mercadoria) {
        return repository.save(mercadoria);
    }

    @PutMapping("/{id}")
    public Mercadoria update(@PathVariable(value = "id") Long mercadoriaId, @RequestBody Mercadoria mercadoria) throws EntityNotFoundException {
        Mercadoria mercadoriaFind = repository.findById(mercadoriaId).orElseThrow(() -> new EntityNotFoundException("Mercadoria não encontrada com 10:  "+mercadoriaId));
        mercadoriaFind.setId(mercadoria.getId());
        mercadoriaFind.setNome(mercadoria.getNome());

        return repository.save(mercadoriaFind);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) throws EntityNotFoundException {
        Mercadoria mercadoriaFind = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Mercadoria não encontrada com ID:" + id));

        repository.delete(mercadoriaFind);
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
