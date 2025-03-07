package br.com.projeto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.projeto.api.repository.ServicoRepository;
import br.com.projeto.api.servico.Servico;
import jakarta.validation.Valid;
import br.com.projeto.api.model.Cliente;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Pessoa;

@RestController
public class Controller {
    @Autowired // injeção de dependência que não precisa mais instanciar métodos
    private ServicoRepository repository; // Irá conter as ações do banco de dados:cadastrar, deletar, atualizar e listar

    @Autowired
    private Servico servico; 
    // Método para rota de cadastro
    @PostMapping("/api")
    // public List<Pessoa> cadastrar(@RequestBody Pessoa pessoa) {
    //     return repository.save(pessoa);
    // }
    public ResponseEntity<?> cadastrar(@RequestBody Pessoa pessoa) {
        // return repository.save(pessoa);
        return servico.cadastrar(pessoa);
    }

    // Método para rota de listagem
    @GetMapping("/api")
    // public List<Pessoa> selecionar() {
    //     return repository.findAll();
    // }
    public ResponseEntity<?> selecionar() {
        return servico.selecionar();
    }

    // Método para rota de listagem por id
    // @GetMapping("/api/{codigo}")
    // public Pessoa selecionarPeloCodigo(@PathVariable int codigo) {
    //     return repository.findById(codigo).orElse(null);
    // }
    @GetMapping("/api/{codigo}")
    public ResponseEntity<?> selecionarPeloCodigo(@PathVariable int codigo) {
        return servico.selecionarPeloCodigo(codigo);
    }

    // Método para rota de atualização de todo objeto
    // @PutMapping("/api")
    // public Pessoa editar(@RequestBody Pessoa pessoa) {
    //     return repository.save(pessoa);
    // }
    @PutMapping("/api")
    public ResponseEntity<?> editar(@RequestBody Pessoa pessoa) {
        return servico.editar(pessoa);
    }

    // método para rota de exclusão de todo
    // @DeleteMapping("/api/{codigo}")
    // public void excluir(@PathVariable int codigo) {
    //     Pessoa pessoa = repository.findById(codigo).orElse(null);
    //     repository.delete(pessoa);
    //     // repository.deleteById(codigo);
    // }
    @DeleteMapping("/api/{codigo}")
    public ResponseEntity<?> remover(@PathVariable int codigo) {
        return servico.remover(codigo);
        // return ResponseEntity.ok().build();
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
    // Filtrar dados pelo nome com o comando endWith
    @GetMapping("/api/terminaCom")
    public List<Pessoa> terminaCom() {
        return repository.findByNomeEndsWith("a");
    }
    // Somar idades
    @GetMapping("/api/somaIdades")
    public int somaIdades() {
        return repository.somaIdades();
    }
    // Filtrar dados pela idade com o comando idadeMaiorIgual
    @GetMapping("/api/idadeMaiorIgual/{idade}")
    public List<Pessoa> idadeMaioreIgual(@PathVariable int idade) {
        return repository.idadeMaiorIgual(idade);
    }

    @PostMapping("/cliente")
    //Para que o validar o cliente, é necessário colocar o @Valid. Do contrário, o NotEmpty não funcionará.
    public void cliente(@Valid @RequestBody Cliente cliente) {
        
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
    // ResponseEntity é um objeto que contém o status da requisição
    // @GetMapping("/status")
    // public String status(){
    //     return "Configurando Status";
    // }
    
    // ResponseEntity é um objeto que contém o status da requisição
    @GetMapping("/status")
    public ResponseEntity<?> status(){
        return ResponseEntity.ok("Configurando Status");
        // return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}