package fundamentos.exercicios;

import java.util.Scanner;

/*
 *  Para carros é preciso ter cautela ao escolher o combustível na hora de abastecer. A principal diferença de preços e vantagens entre os dois combustíveis está na proporção preço X desempenho. Para o álcool ser mais vantajoso do que a gasolina, o preço do litro tem que custar até 70% do litro da gasolina. baseado nestas informações desenvolva um aplicativo no console(terminal) para determinar qual é o combustível mais vantajoso para abastecer.
 * */

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
