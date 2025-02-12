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
            int tlPista = 100; // tamanho da pista
            int posicao = 0; // posição inicial do corredor na pista
            string pista = "";
            string CorredorPista = "";
            string numerosPista = "";

            Corredor c1 = new Corredor();
            c1.Nome = "d";

            // Monta a imagem do corredor na pista na posição inicial
            pista = "";
            CorredorPista = "";
            posicao = c1.Correr();

            for (int i = 1; i <= tlPista; i++) // Corrigido de i >= tlPista para i <= tlPista
            {
                pista += "_"; // Corrigido erro de ponto e vírgula

                if (i == posicao)
                {
                    CorredorPista += c1.Nome;
                }
                else
                {
                    CorredorPista += " ";
                }
            }
            // Exibir a pista, a posição do corredor e a numeração da pista
            Console.WriteLine(CorredorPista);
            Console.WriteLine(pista);
            Console.ReadKey();
        }
    }
}
