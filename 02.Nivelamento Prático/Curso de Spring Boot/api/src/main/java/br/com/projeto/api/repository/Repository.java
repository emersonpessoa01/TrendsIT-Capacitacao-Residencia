package br.com.projeto.api.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.projeto.api.model.Pessoa;

public interface Repository extends JpaRepository<Pessoa, Integer> {
    // List<Pessoa> findAll();
    // Pessoa findById(int codigo);
    // List<Pessoa> findByOrderByNome();
    List<Pessoa> findByOrderByNomeDesc();
    List<Pessoa> findByNomeOrderByIdadeDesc(String nome);
    List<Pessoa> findByNomeContaining(String termo);
    List<Pessoa> findByNomeStartsWith(String termo);
    List<Pessoa> findByNomeEndsWith(String termo);

    // Criar o o próprio sql com @query
    @Query(value="SELECT SUM(idade) FROM pessoas",nativeQuery = true)
    int somaIdades();

// }
}