package fundamentos.AgenciaBancaria.contas;

//Exemplo de modificador de acesso Public
//Exemplo de modificador de acesso Private
public class Conta {
	//Public
	// atributos
//	public String cliente;
//	public double saldo;
//
//	// construtor
//	public Contas() {
//		System.out.println("Agência 0261");
//
//	}
//
//	public void exibirSaldo() {
//		System.out.println("Saldo: R$ " + saldo);
//
//	}
	//Private
	// atributos
		protected String cliente;
		protected double saldo;

		// construtor
		public Conta() {
			System.out.println("Agência 0261");

		}

		protected void exibirSaldo() {
			System.out.println("Saldo: R$ " + saldo);

		}
}
