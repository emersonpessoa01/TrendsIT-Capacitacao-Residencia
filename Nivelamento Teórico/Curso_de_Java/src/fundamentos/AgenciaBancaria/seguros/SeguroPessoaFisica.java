package fundamentos.AgenciaBancaria.seguros;

import fundamentos.AgenciaBancaria.contas.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
//		cc3.cliente = "Fernanda Ferreira";
		cc3.setCliente("Fernanda Ferreira");
//		cc3.saldo = 250000;
		cc3.setSaldo(25000);
//		System.out.println("Cliente: "+ cc3.cliente);
		System.out.println("Cliente: "+ cc3.getCliente());
		cc3.exibirSaldo();

	}

}
