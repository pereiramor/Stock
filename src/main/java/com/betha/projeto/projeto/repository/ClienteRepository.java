package com.betha.projeto.projeto.repository;

import com.betha.projeto.projeto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByCpf(String cpf);
}
