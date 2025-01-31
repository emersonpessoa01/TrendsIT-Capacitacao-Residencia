package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

}