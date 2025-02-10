package br.com.projeto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.projeto.api.repository.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Pessoa;

@RestController
public class Controller {
    @Autowired // injeção de dependência que não precisa mais instanciar métodos
    private Repository repository; // Irá conter as ações do banco de dados:cadastrar, deletar, atualizar e listar

    // Método para rota de cadastro
    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa pessoa) {
        return repository.save(pessoa);
    }

    // Método para rota de listagem
    @GetMapping("/api")
    public List<Pessoa> selecionar() {
        return repository.findAll();
    }

    // Método para rota de listagem por id
    @GetMapping("/api/{codigo}")
    public Pessoa selecionarPeloCodigo(@PathVariable int codigo) {
        return repository.findById(codigo).get();
    }

    // Método para rota de atualização de todo objeto
    @PutMapping("/api")
    public Pessoa atualizar(@RequestBody Pessoa pessoa) {
        return repository.save(pessoa);
    }

    // método para rota de exclusão de todo
    @DeleteMapping("/api/{codigo}")
    public void excluir(@PathVariable int codigo) {
        Pessoa pessoa = selecionarPeloCodigo(codigo);
        repository.delete(pessoa);
        // repository.deleteById(codigo);
    }

    // Contar registros com o comando count()
    @GetMapping("/api/contador")
    public long contador() {
        return repository.count();

    }

    // Ordenar registro pelo nome com o comando orderBy
    @GetMapping("/api/ordenarNomesDesc")
    public List<Pessoa> ordernarNomes() {
        return repository.findByOrderByNomeDesc();
    }

    // Ordenar registro pelo nome ordenado pela idade com o comando orderBy
    @GetMapping("/api/ordenarNomeIdade")
    public List<Pessoa> ordernarNomesIdade() {
        return repository.findByNomeOrderByIdadeDesc("Patriiciah");
    }

    // Filtrar dados pelo nome com o comando containing(Como se fosse um like)
    @GetMapping("/api/nomeContem")
    public List<Pessoa> nomeContem() {
        return repository.findByNomeContaining("triiciah");
    }

    // Filtrar dados pelo nome com o comando startWith
    @GetMapping("/api/iniciaCom")
    public List<Pessoa> iniciaCom() {
        return repository.findByNomeStartsWith("Patri");
    }

    @GetMapping("/api/terminaCom")
    public List<Pessoa> terminaCom() {
        return repository.findByNomeEndsWith("ciah");
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/welcome")
    public String helloJungle() {
        return "Welcome to the jungle";
    }

    @GetMapping("/welcome/{nome}")
    public String helloJungle(@PathVariable String nome) {
        /* Concatenar nome */
        return "Welcome to the jungle, " + nome + "!";
    }
    /* Vincular classe Pessoa com a Controller */
    // @PostMapping("/api/pessoa") //Responsável por exibir um nome e idade
    // public Pessoa pessoa(@RequestBody Pessoa p){
    // return p;
    // }

}