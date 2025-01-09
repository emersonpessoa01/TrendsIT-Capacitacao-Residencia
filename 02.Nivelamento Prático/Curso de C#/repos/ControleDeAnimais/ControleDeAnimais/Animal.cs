using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ControleDeAnimais
{
	public enum TipoAnimal
	{
		Cachorro,
		Gato,
		Peixe
	};

    public class Animal

    {
        public Animal()
        {
			this.Nome = "";
			this.Tipo = TipoAnimal.Peixe;
        }
		public Animal(String nome, TipoAnimal tipo)
        {
			this.Nome = nome;
			this.Tipo = tipo;
        }
        private String nome;

		public  String Nome
		{
			get { return nome; }
			set { nome = value.ToUpper(); }
		}

        //private String tipo;// A variável tipo é do tipo String
        private TipoAnimal tipo; //Com o enum o tipo é do tipo TipoAnimal
        public TipoAnimal Tipo
		{//Valores definidos pelo proprietátio - Cachorro, Gato, Peixe
			get { return tipo; }
			//set { 
			//	if(value == "Cachorro" || value == "Gato" || value == "Peixe")
			//	{
			//		tipo = value;
			//	}
			//	else
			//	{
			//		tipo = "Peixe";

			//             }
			//}

			set { tipo = value; }
		}


	}
}
