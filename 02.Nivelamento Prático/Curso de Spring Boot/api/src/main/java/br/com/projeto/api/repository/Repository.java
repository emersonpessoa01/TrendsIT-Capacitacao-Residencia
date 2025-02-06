package br.com.projeto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.api.Model.Pessoa;

public interface Repository extends JpaRepository<Pessoa, Integer> {
    
}