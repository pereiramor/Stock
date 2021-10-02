package com.betha.projeto.projeto.repository;


import com.betha.projeto.projeto.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}
