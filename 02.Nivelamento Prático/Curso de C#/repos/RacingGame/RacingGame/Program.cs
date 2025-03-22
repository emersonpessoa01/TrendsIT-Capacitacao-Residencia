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
             
            //Enquanto a posição do corredor for menor que o tamanho da pista(Está mandando o corredor correr)
            Pista pista1 = new Pista(100, new Corredor("e"));
            Pista pista2 = new Pista(100, new Corredor("p"));

            Boolean ganhou = false;
            while (ganhou == false)
            {
                Console.Clear(); //Limpa a tela 
                if(pista1.AtualizarCorrida() == true) ganhou = true;
                if (pista2.AtualizarCorrida() == true) ganhou = true;
                pista1.AtualizarCorrida(); //Atualiza a corrida
                pista1.ExibirPista(); //Exibe a pista
                pista2.AtualizarCorrida(); //Atualiza a corrida
                pista2.ExibirPista(); //Exibe a pista

                Console.ReadKey();
            }
           

        }
    }
}
