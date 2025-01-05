using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooPokemon
{
    public class Pokemon
    {
        public Pokemon()
        {
            this.Nome = ""; //Nome vai começar em branco
            this.Descricao = ""; //Descrição vai começar em branco
        }
        //Sobrecarga
        public Pokemon(String nome, String descricao)
        {
            this.Nome = nome;
            this.Descricao = descricao;
        }
        private String nome;

        public String Nome
        {
            get
            {
                return nome;
            }
            set
            {
                String texto = value.ToUpper();
                nome = texto;
            }
        }

        private String descricao; //Armazena o valor da propriedade Descricao

        public String Descricao //Representa a característica Descricao do meu Pokemon
        {
            get
            {
                return this.descricao;
            }
            set
            {
                String texto = value.ToUpper();
                this.descricao = texto;
            }
        }

        public void ExibirDaddos()
        {
            Console.WriteLine("Nome do Pokemon: " + this.Nome);
            Console.WriteLine("Descrição do Pokemon: " + this.Descricao);
        }
        //Sobrecarga
        public void ExibirDaddos(Boolean formatado)
        {
            if (formatado == true)
            {
                Console.WriteLine("Pokemon " + this.Nome + ": " + this.Descricao.ToUpper());

            }
            else
            {
                Console.WriteLine("Nome do Pokemon: " + this.Nome);
                Console.WriteLine("Descrição do Pokemon: " + this.Descricao);
            }
        }

    }
}
