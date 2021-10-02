package com.betha.projeto.projeto.repository;

import com.betha.projeto.projeto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
