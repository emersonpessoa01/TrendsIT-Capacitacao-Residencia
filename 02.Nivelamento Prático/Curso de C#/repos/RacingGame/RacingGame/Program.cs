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
            
            
            Corredor c1 = new Corredor();
            c1.Nome = "e";
           
            //Enquanto a posição do corredor for menor que o tamanho da pista(Está mandando o corredor correr)
            Pista pista1 = new Pista(100, c1);
            while (pista1.PosAtleta < pista1.Tamanho)
            {
                Console.Clear(); //Limpa a tela 
                pista1.AtualizarCorrida(); //Atualiza a corrida
                pista1.ExibirPista(); //Exibe a pista

                Console.ReadKey();
            }

        }
    }
}
