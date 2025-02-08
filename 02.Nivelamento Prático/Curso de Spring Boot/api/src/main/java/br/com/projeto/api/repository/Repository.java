package br.com.projeto.api.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.api.model.Pessoa;

public interface Repository extends JpaRepository<Pessoa, Integer> {
    // List<Pessoa> findAll();
    // Pessoa findById(int codigo);
    // List<Pessoa> findByOrderByNome();
    List<Pessoa> findByOrderByNomeDesc();
    List<Pessoa> findByNomeOrderByIdadeDesc(String nome);
// }
}