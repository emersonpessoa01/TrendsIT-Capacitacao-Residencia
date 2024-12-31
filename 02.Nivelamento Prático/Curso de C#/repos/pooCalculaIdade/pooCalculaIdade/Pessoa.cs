using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooCalculaIdade
{
    public class Pessoa

    {
        String nomePessoa;
        int anoNascimentoPessoa;
        //Construtor
        public Pessoa(String nomePessoa, int anoNascimentoPessoa) {
            this.nome = nomePessoa;
            this.anoNascimento = anoNascimentoPessoa;
            this.CalcularIdade();
        }

    //Encapsulamento dos dados
        private int anoNascimento;

        public int AnoNascimento
        {
            get { return anoNascimento; }
            set { anoNascimento = value; }
        }

        private String nome;

        public String Nome
        {
            get { return nome; }
            set { nome = value.ToUpper(); }
        }

        //Vamos melhorar encapsulando a idade
        private int idade;

        public int Idade
        {
            get { 
                this.CalcularIdade();
                return this.idade; 
            }
            
        }


        //Executar uma ação exibindo uma data de nascimento

        public void exibirDados()
        {
            Console.WriteLine("Nome: " + this.Nome);
            Console.WriteLine("Ano de nascimento: " + this.AnoNascimento);
            //int idade = this.CalcularIdade();
            this.CalcularIdade();
            Console.WriteLine("Idade: "+this.idade);

        }
        private void CalcularIdade()
        {
            DateTime data = DateTime.Now;
            int ano = data.Year;
            //int idade = ano - this.anoNascimento;
            //return idade;
            this.idade = ano - this.AnoNascimento;
        }
    }
}
