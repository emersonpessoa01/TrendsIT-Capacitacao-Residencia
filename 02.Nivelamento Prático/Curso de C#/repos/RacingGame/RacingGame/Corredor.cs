using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RacingGame
{
    public class Corredor
    {
        //Construtor é uma função sem tipo de retorno que tem o mesmo nome da classe
        public Corredor()
        {
            this.Nome = "";

        }
        public Corredor(string nome)
        {
            this.Nome = nome; //this é uma referência ao objeto atual
        }

        private String nome;

        public String Nome
        {   
            get { return this.nome; }
            set {
                this.nome = value.ToLower();
                if (value.Length > 1) this.nome = value[0].ToString().ToLower();
                if(value.Length == 0) this.nome = "d";
                
            }
        } 


        //Método com características de propriedade Nome, irá executar uma ação(Correr)
        public int Correr()
        {
            Random rnd = new Random();
            return rnd.Next(1, 10); //retorna um número aleatório entre 1 e 10
        }

    }
}
