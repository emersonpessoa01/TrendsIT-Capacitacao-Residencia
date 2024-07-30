package fundamentos.exercicios;

import java.util.Scanner;

/*
 * Aula 10 - Jogo do Dado
 * Autor José de Assis
 * 
 */

public class JogoDado {

	public static void main(String[] args) {
		char opcao = 's';
		Scanner teclado = new Scanner(System.in);
//		do {
//			System.out.println("Lançamento do DADO........................");
//		} while (opcao == 's' || opcao == 'S');
		while (opcao == 's') {
			int dado = (int) (Math.random() * 6 + 1);
			System.out.println("Face: " + dado);

			System.out.println("Deseja lançar o dado novamente[ S | N ]: ");
			opcao = teclado.next().charAt(0); // captura a primeira letra e ignora as outras
			if (opcao == 's' || opcao == 'S') {
				continue;
			} else {
				System.out.println("----FIM DO JOGO----");
			}
		}
		teclado.close();
	}

}
