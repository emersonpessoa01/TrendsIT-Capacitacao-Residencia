package fundamentos.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		// Variáveis
		double c, f;

		// Objetos
		// Para capturar o teclado
		Scanner teclado = new Scanner(System.in);
		// Formatação de casas decimais

		DecimalFormat formatador = new DecimalFormat("#0.0");

		// entrada
		System.out.println("Convresão de Temperatura: ");
		System.out.println("Digite a temperatura em fahrenheit: ");
		f = teclado.nextDouble();

		// processamento
		c = (5 * (f - 32)) / 9;

		// saída

		System.out.println("temperattura em Celsius: " + formatador.format(c) + " °C");
		teclado.close();
	}

}
