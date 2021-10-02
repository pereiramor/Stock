package com.betha.projeto.projeto.repository;


import com.betha.projeto.projeto.model.Mercadoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MercadoriaRepository extends JpaRepository<Mercadoria, Long> {
}
