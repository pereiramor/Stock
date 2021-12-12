package com.betha.projeto.projeto.resource;

import com.betha.projeto.projeto.model.Cliente;
import com.betha.projeto.projeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.ValidationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> getClientes() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getClientesId(@PathVariable(value = "id") Long clienteId) throws EntityNotFoundException {
        Cliente clienteFind = repository.findById(clienteId).orElseThrow(() ->new EntityNotFoundException("Cliente não encontrado com ID::" +clienteId));
        return clienteFind;
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        List<Cliente> byCpf = repository.findByCpf(cliente.getCpf());

        if(!byCpf.isEmpty()){
            throw new ValidationException("Já existe um cliente com o mesmo CPF registrado!");
        }

        return repository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable(value = "id") Long clienteId, @RequestBody Cliente cliente) throws EntityNotFoundException {
        Cliente clienteFind = repository.findById(clienteId).orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com ID::  "+clienteId));
        clienteFind.setId(cliente.getId());
        clienteFind.setNome(cliente.getNome());
        clienteFind.setCpf(cliente.getCpf());
        clienteFind.setRg(cliente.getRg());
        clienteFind.setEnderecos(cliente.getEnderecos());
        clienteFind.setEmail(cliente.getEmail());
        clienteFind.setSexo(cliente.getSexo());
        clienteFind.setDocumento(cliente.getDocumento());


        return repository.save(clienteFind);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) throws EntityNotFoundException {
        Cliente clienteFind = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com ID::" + id));

        repository.delete(clienteFind);
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
