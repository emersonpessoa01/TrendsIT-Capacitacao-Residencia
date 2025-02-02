package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.Model.Pessoa;

@RestController
public class Controller {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/jungle")
    public String helloJungle() {
        /* Conacatenar nome */
        return "Welcome to the jungle";
    }
    @GetMapping("/jungle/{nome}")
    public String helloJungle(@PathVariable String nome) {
        /* Conacatenar nome */
        return "Welcome to the jungle, " + nome + "!";
    }
    /* Vincular classe Pessoa com a Controller */
    @PostMapping("/pessoa") //Responsável por exibir um nomee idade
    public Pessoa pessoa(@RequestBody Pessoa p){
       return p;
    } 

}