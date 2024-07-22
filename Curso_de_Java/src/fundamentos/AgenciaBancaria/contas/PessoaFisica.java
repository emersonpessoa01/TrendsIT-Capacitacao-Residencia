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
		cc1.saldo = 10000;
		System.out.println("Cliente: "+ cc1.cliente);
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		
		System.out.println("-----------------------------------");
		
		Conta cc2 = new Conta();
		cc2.cliente = "Luciene Ferreira";
		cc2.saldo = 20000;
		System.out.println("Cliente: "+ cc2.cliente);
		cc2.exibirSaldo();
		cc2.depositar(1000);
		cc2.exibirSaldo();
		
		System.out.println("-----------------------------------");
		System.out.println("Transferência: ");
		System.out.println("Cliente: "+ cc1.cliente);
		System.out.println("Favorecido: "+ cc2.cliente);
		cc1.transferir(cc2, 2000);
		System.out.println("");
		System.out.println("Cliente: "+ cc1.cliente);
		cc1.exibirSaldo();
		System.out.println("Cliente: "+ cc2.cliente);
		cc2.exibirSaldo();
		System.out.println("-----------------------------------");
		System.out.println("Relatório gerencial: ");
		Conta gerente= new Conta();
		double relatorio = gerente.soma(cc1.saldo, cc2.saldo);
		System.out.println("Saldo total nas contas: R$ "+ relatorio);
		
		
		
		
		
	}

}
