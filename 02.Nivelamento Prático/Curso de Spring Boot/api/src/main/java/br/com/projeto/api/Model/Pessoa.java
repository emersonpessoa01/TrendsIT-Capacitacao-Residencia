package br.com.projeto.api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Serve para especificar a criação da tabela
@Table(name = "pessoas") //Serve para alterar o nome da tabela
public class Pessoa {
    @Id //Responsável pela criação da chave-primária
    // 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Responsável por gerar o valor da chave-primária de forma autoincrementada
    private int codigo; // Responsável pela chave-primária
    private String nome;
    private int idade;

    // Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}