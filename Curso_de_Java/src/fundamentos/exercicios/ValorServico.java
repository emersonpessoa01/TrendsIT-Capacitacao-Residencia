package fundamentos.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Desenvolva uma aplicação no console.log(terminal) 
 * para calcular o valor da hora de um serviços de acordo com a fórmula
 * */
public class ValorServico {

	public static void main(String[] args) {
		// variaveis
		double hora, remuneracao, impostos, investimentos, custo, cargaHoraria;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// entrada
		System.out.println("Cálculo dovalor da hora de um serviço");
		System.out.print("Remuneração mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		impostos = remuneracao * 0.3;
		investimentos = remuneracao * 0.2;
		System.out.print("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Carga horária mensal trabalhada: ");
		cargaHoraria = teclado.nextDouble();

		// processamento
		hora = (remuneracao + impostos + custo + investimentos) / cargaHoraria;

		// saída
		System.out.println("Valor da hora: " + formatador.format(hora));
		teclado.close();

	}

}
