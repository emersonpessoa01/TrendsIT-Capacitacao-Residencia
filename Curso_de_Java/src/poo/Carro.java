package poo;

import java.util.Random;
<<<<<<< HEAD
//modelo para criação de objetos
//Exemplos de abstração: definir uma classe
=======

>>>>>>> 751acaa1614533afc97527b40bb73c8bfb16f8db
public class Carro {
	int ano;
	String cor;

	public Carro() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi:" + chassi);
	}

	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
	}

	void ligar() {
		System.out.println("Engine ON...");
	}

	void desligar() {
		System.out.println("Engine OFF...");
	}

	void acelerar() {
		System.out.println("Vrummmmmmm...");
	}

}
