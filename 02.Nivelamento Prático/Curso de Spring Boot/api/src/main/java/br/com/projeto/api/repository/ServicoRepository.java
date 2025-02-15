package br.com.projeto.api.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import br.com.projeto.api.model.Pessoa;
//O repository é responsável por fazer a conexão com o banco de dados
//O JpaRepository é uma interface que já possui métodos prontos para serem utilizados
// O jpaRepository é uma interface possui as ações básicas do banco de dados: cadastrar, selecionar, alterar e excluir
@Repository
public interface ServicoRepository extends JpaRepository<Pessoa, Integer> {
    // List<Pessoa> findAll();
    // Pessoa findById(int codigo);
    // List<Pessoa> findByOrderByNome();
    List<Pessoa> findByOrderByNomeDesc();
    List<Pessoa> findByNomeOrderByIdadeDesc(String nome);
    List<Pessoa> findByNomeContaining(String termo);
    List<Pessoa> findByNomeStartsWith(String termo);
    List<Pessoa> findByNomeEndsWith(String termo);

    // Criar o próprio sql com @query
    @Query(value="SELECT SUM(idade) FROM pessoas",nativeQuery = true)
    int somaIdades();

    // Listar pessoas com idade acima de 18 anos ou igual/maior que uma determinada idade
    @Query(value="SELECT * FROM pessoas WHERE idade >= :idade",nativeQuery = true)
    List<Pessoa> idadeMaiorIgual(int idade);

// }
}