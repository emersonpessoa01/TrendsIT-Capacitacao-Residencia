package fundamentos.exercicios;

import java.util.Scanner;

public class AlcoolGasolina {

	public static void main(String[] args) {
		// variáveis
		double alcool, gasolina;

		// objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do álcool: ");
		alcool = teclado.nextDouble();

		System.out.println("Digite o valor do gasolina: ");
		gasolina = teclado.nextDouble();

		// processamento e saída

		if (alcool < .7 * gasolina) {
			System.out.println("Abastecer com Álcool");
		} else {
			System.out.println("Abastecer com Gasolina");

		}
		teclado.close();

	}

}
