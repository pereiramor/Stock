package com.betha.projeto.projeto.resource;

import ch.qos.logback.core.net.server.Client;
import com.betha.projeto.projeto.model.Cidade;
import com.betha.projeto.projeto.model.Cliente;
import com.betha.projeto.projeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping ("/api/clientes/")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> getClientes() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getClientesId(@PathVariable(value = "id") Long clienteId, @RequestBody Cliente cliente) throws EntityNotFoundException {
        Cliente clienteFind = repository.findById(clienteId).orElseThrow(() ->new EntityNotFoundException("Cliente não encontrado com ID::" +clienteId));
        return clienteFind;
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {

        return repository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable(value = "id") Long clienteId, @RequestBody Cliente cliente) throws EntityNotFoundException {
        Cliente clienteFind = repository.findById(clienteId).orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com ID::  "+clienteId));
        clienteFind.setId(cliente.getId());
        clienteFind.setNome(cliente.getNome());
        clienteFind.setCpf(cliente.getCpf());
        clienteFind.setRg(cliente.getRg());


        return repository.save(clienteFind);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) throws EntityNotFoundException {
        Cliente clienteFind = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com ID::" + id));

        repository.delete(clienteFind);
        return ResponseEntity.noContent().build();
    }
}
