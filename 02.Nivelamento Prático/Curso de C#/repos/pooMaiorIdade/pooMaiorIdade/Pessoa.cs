﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooMaiorIdade
{
    public class Pessoa
    {
        //Construtores
        public Pessoa()
        {
            this.Nome = "";
            this.Idade = 0;

        }
        //Gerando a sobrecarga
        public Pessoa(String nome, int idade)
        {
            this.Nome = nome;
            this.Idade = idade;

        }

        //Propriedades
        private String nome;

        public string Nome
        {
            get { return nome; }
            set { nome = value.ToUpper(); }
        }

        private int idade;

        public int Idade
        {
            get { return idade; }
            set
            {
                if (idade >= 0)
                {
                    idade = value;

                }
                else
                {
                    this.idade = 0;
                }
            }
        }


        //Métodos
        public void ExibirDados()
        {
            Console.WriteLine("Nome: " + this.Nome);
            Console.WriteLine("Idade: " + this.Idade);
        }

    }
}
