package fundamentos.AgenciaBancaria.contas;

public class PessoaFisica {

	public static void main(String[] args) {
		//public
//		Contas cc1 = new Contas();
//		cc1.cliente = "Emerson Pessoa";
//		cc1.saldo = 100000;
//		System.out.println("Cliente: "+ cc1.cliente);
//		cc1.exibirSaldo();
//		
//		System.out.println("-----------------------------------");
//		
//		Contas cc2 = new Contas();
//		cc2.cliente = "Luciene Ferreira";
//		cc2.saldo = 200000;
//		System.out.println("Cliente: "+ cc2.cliente);
//		cc2.exibirSaldo();
		
		//Protected
		Conta cc1 = new Conta();
		cc1.cliente = "Emerson Pessoa";
		cc1.saldo = 100000;
		System.out.println("Cliente: "+ cc1.cliente);
		cc1.exibirSaldo();
		
		System.out.println("-----------------------------------");
		
		Conta cc2 = new Conta();
		cc2.cliente = "Luciene Ferreira";
		cc2.saldo = 200000;
		System.out.println("Cliente: "+ cc2.cliente);
		cc2.exibirSaldo();
		
		
	}

}
