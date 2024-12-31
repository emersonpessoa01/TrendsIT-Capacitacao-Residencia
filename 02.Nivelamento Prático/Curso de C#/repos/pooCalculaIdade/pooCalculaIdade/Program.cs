using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooCalculaIdade
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Programa que calcula a idade de uma pessoa");
            //Pessoa pessoa = new Pessoa("Luciene Ferreira",1976);
            //pessoa.exibirDados();

            //Console.WriteLine(pessoa.Nome);
            Console.WriteLine("Nome da pessoa: ");
            //pessoa.Nome = Console.ReadLine();
            String nome = Console.ReadLine();
            Console.WriteLine("Ano de nascimento");
            //pessoa.AnoNascimento = Convert.ToInt32(Console.ReadLine());
            int ano = Convert.ToInt32(Console.ReadLine());
            Pessoa pessoa = new Pessoa(nome, ano);
            pessoa.exibirDados();
            //Console.WriteLine(pessoa.Idade);
            Console.ReadKey();

        }
    }
}
