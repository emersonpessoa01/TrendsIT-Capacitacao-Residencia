package fundamentos.AgenciaBancaria.contas;

//É uma classe modelo
//Exemplo de modificador de acesso Public
//Exemplo de modificador de acesso Private
public class Conta {
	// Public
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
	// Private
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

	// Métodos com passagem de parâmetros
	void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$ " + valor);
	}

	void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: R$ " + valor);
	}

	// Métodoscom passagem de objetos
	void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$ " + valor);
	}

	// Método com retornos
	// Emissão de relatório de saldos
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
		
	}

}
