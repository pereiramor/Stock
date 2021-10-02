package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Cidade;
import com.betha.projeto.projeto.model.Movimentacao;
import com.betha.projeto.projeto.repository.CidadeRepository;
import com.betha.projeto.projeto.repository.MovimentacaoRepository;
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
    @RequestMapping("/api/Movimentacoes")
    public class MovimentacaoController {

        @Autowired
        private MovimentacaoRepository repository;

        @GetMapping
        public List<Movimentacao> getMovimentacoes() {

            return repository.findAll();
        }

        @GetMapping("/{id}")
        public Movimentacao getMovimentacoesId(@PathVariable(value = "id") Long MovimentacaoId, @RequestBody Movimentacao movimentacao) throws EntityNotFoundException {
            Movimentacao movimentacaoFind = repository.findById(MovimentacaoId).orElseThrow(() -> new EntityNotFoundException("Movimentacao não encontrada com ID::" + MovimentacaoId));
            return movimentacaoFind;
        }

        @PostMapping
        public Movimentacao create(@RequestBody Movimentacao movimentacao) {
            return repository.save(movimentacao);
        }
    }
//        @PutMapping("/{id}")
//        public Movimentacao update(@PathVariable(value = "id") Long movimentacaoId, @RequestBody Movimentacao movimentacao) throws EntityNotFoundException {
//            Movimentacao movimentacaoFind = repository.findById(cidadeId).orElseThrow(() -> new EntityNotFoundException("Cidade não encontrada com 10::  "+cidadeId));
//            movimentacaoFind.setId(cidade.getId());
//            movimentacaoFind.setNome(cidade.getNome());
//
//            return repository.save(cidadeFind);
//
//        }
//
//        @DeleteMapping("/{id}")
//        public ResponseEntity delete(@PathVariable(value = "id") Long id) throws EntityNotFoundException {
//            Cidade cidadeFind = repository.findById(id)
//                    .orElseThrow(() -> new EntityNotFoundException("Cidade não encontrada com ID::" + id));
//
//            repository.delete(cidadeFind);
//            return ResponseEntity.noContent().build();
//        }
//
//        @ResponseStatus(HttpStatus.BAD_REQUEST)
//        @ExceptionHandler(MethodArgumentNotValidException.class)
//        public Map<String, String> handleValidationExceptions(
//                MethodArgumentNotValidException ex) {
//            Map<String, String> errors = new HashMap<>();
//            ex.getBindingResult().getAllErrors().forEach((error) -> {
//                String fieldName = ((FieldError) error).getField();
//                String errorMessage = error.getDefaultMessage();
//                errors.put(fieldName, errorMessage);
//            });
//            return errors;
//        }
//}
