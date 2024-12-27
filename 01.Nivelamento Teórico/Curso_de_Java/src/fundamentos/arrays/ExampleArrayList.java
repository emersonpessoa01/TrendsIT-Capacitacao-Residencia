package fundamentos.arrays;

import java.util.ArrayList;

public class ExampleArrayList {

	public static void main(String[] args) {
		ArrayList<String>contatos = new ArrayList<>();
		contatos.add("Emerson Pessoa");
		contatos.add("9999-9999");
		contatos.add("eme@mail.com");
		contatos.add("Luciene Ferreira");
		contatos.add("9999-8888");
		contatos.add("lupa@mail.com");
		
		
		System.out.println("Tamanho do Array: "+ contatos.size());
		System.out.println(contatos);
		System.out.println("E-mail Emerson Pessoa(ìndice[2]): "+contatos.get(2));
		System.out.println("");

		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i));
			
			
		}
	}  

}
