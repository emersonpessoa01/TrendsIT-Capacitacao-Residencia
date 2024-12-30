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
            Pessoa pessoa = new Pessoa();
            Console.WriteLine("Nome da pessoa: ");
            pessoa.Nome = Console.ReadLine();
            Console.WriteLine("Ano de nascimento");
            pessoa.AnoNascimento = Convert.ToInt32(Console.ReadLine());
            //pessoa.exibirDados();
            Console.WriteLine(pessoa.Idade);
            Console.ReadKey();

        }
    }
}
