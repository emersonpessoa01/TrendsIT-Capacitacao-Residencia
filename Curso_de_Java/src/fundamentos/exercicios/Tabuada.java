package fundamentos.exercicios;
/*
 * Curso de Java aula 9 - estrutura de repetição
 * @autor José de Assis
 */

import java.util.Iterator;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int valor;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor a tabuada: ");
		valor = teclado.nextInt();
		System.out.println("");

		for (int i = 0; i <= 10; i++) {
			System.out.println(valor + "x" + i + " = " + (valor * i));

		}
	}

}
