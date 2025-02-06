package br.com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.projeto.api.repository.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.Model.Pessoa;

@RestController
public class Controller {
    @Autowired // injeção de dependência que precisa mais instanciar métodos
    private Repository repository; //Irá conter as ações do banco de dados:cadastrar, deletar, atualizar e listar 

    //Método para rota de cadastro
    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa pessoa) {
        return repository.save(pessoa);
    }
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/welcome")
    public String helloJungle() {
        /* Concatenar nome */
        return "Welcome to the jungle";
    }
    @GetMapping("/welcome/{nome}")
    public String helloJungle(@PathVariable String nome) {
        /* Concatenar nome */
        return "Welcome to the jungle, " + nome + "!";
    }
    /* Vincular classe Pessoa com a Controller */
    @PostMapping("/pessoa") //Responsável por exibir um nome e idade
    public Pessoa pessoa(@RequestBody Pessoa p){
       return p;
    } 
    

}