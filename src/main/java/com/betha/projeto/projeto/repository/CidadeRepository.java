package com.betha.projeto.projeto.repository;

import com.betha.projeto.projeto.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}

