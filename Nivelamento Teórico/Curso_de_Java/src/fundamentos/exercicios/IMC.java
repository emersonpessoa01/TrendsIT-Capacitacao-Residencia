package fundamentos.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Desenvolva um aplicativo no console(terminal)
 * para calcular o valor do IMC. O aplicativo deverá
 * exibir além do IMC a classicação de acordo
 * com a tabela
 * 
 * IMC					CLASSICAÇÃO
 * abaixo de 18,5		Abaixo do peso
 * entre 18,6 e 24,9	Peso ideal
 * entre 25,0 e 29,9	Levemente acima do peso
 * entre 30,0 e 34,9	Obesidade grau I
 * entre 35,0 e 39,9 	Obesidade grau II
 * acima 40				Obesidade grau III(Mórbida)
 */

public class IMC {

	public static void main(String[] args) {
		// variáveis
		double peso, altura, imc;

		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Cálculo do IMC: ");

		// entrada
		System.out.print("Digite o seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite a sua altura: ");
		altura = teclado.nextDouble();

		// processamento
		imc = peso / (altura * altura);

		// saída
		System.out.println("IMC: " + formatador.format(imc) + " kg/m2");

		teclado.close();
		// classificação
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Peso ideal");
		} else if (imc < 30) {
			System.out.println("Levemente acima do peso");
		} else if (imc < 35) {
			System.out.println("Obesidade grau I");

		} else if (imc < 39) {
			System.out.println("Obesidade grau II (Severa)");
		} else {
			System.out.println("Obesidade grau III(Mórbida)");
		}

	}
}