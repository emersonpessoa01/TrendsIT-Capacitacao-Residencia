package fundamentos.arrays;

public class Array1 {
	public static void main(String[] args) {
		String[] carros = { "ferrari", "fusca", "camaro", "uno" };
		System.out.println("Tamanho do Array: " + carros.length);
		System.out.println("Carro: " + carros[2]);
		carros[2] = "porshe";
		System.out.println("Carro: " + carros[2]);
		System.out.println("___________________________________");
		System.out.println("Carros: ");
		
		for (int i = 0; i < carros.length; i++) {
			String lista = carros[i];
			System.out.println(lista);
			
		}
	}
}
