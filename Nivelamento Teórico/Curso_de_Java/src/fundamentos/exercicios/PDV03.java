package fundamentos.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV03 {

	public static void main(String[] args) {
		// Variáveis

		double total, desconto, totalDesconto, valorPago, troco;

		// Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		// Entrada1
		System.out.println("PDV");
		System.out.println("Valor total: ");
		total = teclado.nextDouble();
		System.out.println("Desconto(%): ");
		desconto = teclado.nextDouble();

		// processamento1
		totalDesconto = total - (desconto * total) / 100;
		System.out.print("Total com desconto:  R$" + formatador.format(totalDesconto));
		
		//Entrada2
		System.out.println("____________________");
		System.out.println("valor pago em dinheiro: ");
		valorPago = teclado.nextDouble();
		
		//Processamento2
		troco = valorPago - totalDesconto;
		
		//Saída
		System.out.println("Troco: R$ "+ formatador.format(troco));
		teclado.close();
		
	}

}
