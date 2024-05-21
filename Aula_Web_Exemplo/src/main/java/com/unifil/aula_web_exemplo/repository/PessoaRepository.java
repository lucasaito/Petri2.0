package com.unifil.aula_web_exemplo.repository;

import com.unifil.aula_web_exemplo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
