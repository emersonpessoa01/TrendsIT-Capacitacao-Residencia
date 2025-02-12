using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RacingGame
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int tlPista = 100; //tamanho da pista
            int posicao = 0; //posição inicial do corredor na pista
            Corredor c1 = new Corredor();
            c1.Nome = "";
            Console.WriteLine("Nome: " + c1.Nome);
            Console.ReadKey();

        }
    }
}
