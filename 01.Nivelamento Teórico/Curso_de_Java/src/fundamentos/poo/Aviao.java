package fundamentos.poo;
//Exemplos de heranças: reutilização de 
//variáveis e métodos
public class Aviao extends Carro {
	double envergadura;
	
	//Exemplo de polimorfismo
		//É a modificação do comportamento de um método
		//existente na classe modelo(sobrescrita de métodos)
	void aterrizar() {
		System.out.println("---------____________");
	}
	void acelerar() {
		System.out.println("_________------------");
	}

}
