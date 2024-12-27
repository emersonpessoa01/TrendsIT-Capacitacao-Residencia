package fundamentos.arrays;
/*
 * Aula 16 - Array Multidimensional 
 * @autor José de Assis
 */

public class ExampleArrayMatriz {

	public static void main(String[] args) {
		String[][] agenda = { { "José de Assis", "91234-1234", "professorjosedeassis@mail.com" },
				{ "Bill", "2222-2222", "bill@outlook.com" }, { "linus", "99999-9999", "tux@lunux.com" } };

		// a lista abaico que recupera o telefone do José
		System.out.println(agenda[0][1]);

		// Para recuperar todo o contéudo da tabela
		// As estruturas abaixo percorrem os índices dos arrays
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("---------------------------");
			for (int j = 0; j < agenda.length; j++) {
				System.out.println(agenda[i][j]);
			}

		}
	}

}
