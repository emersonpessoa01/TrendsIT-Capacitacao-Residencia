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
            int posicaoC1 = 0; //posição inicial do corredor na pista
            Corredor c1 = new Corredor();
            c1.Nome = "e";
            String pista = ""; //Vai representar a pista
            string corredorPista = ""; //Vai representar o corredor na pista

            //Enquanto a posição do corredor for menor que o tamanho da pista(Está mandando o corredor correr)
            posicaoC1 = 0;
            while (posicaoC1 < tlPista)
            {

            posicaoC1 += c1.Correr(); //A posição do corredor é incrementada com o valor retornado pelo método correr
                                      //Montar a imagem do corredor na pista
                pista = ""; //Inicia a pista vazia
            corredorPista = ""; //Inicia o corredor na pista vazia
                for (int i = 0; i <= tlPista; i++)
                {
                    pista += "_"; //Monta a pista
                    if (i == posicaoC1)
                    {
                        corredorPista += c1.Nome; //Monta o corredor na pista
                    }
                    else
                    {
                        corredorPista += " "; //Monta o corredor na pista
                    }
                }
            Console.WriteLine(pista); //Imprime a pista
            Console.WriteLine(corredorPista); //Imprime o corredor na pista
            //Console.WriteLine("Nome: " + c1.Nome);
            Console.ReadKey();
            }

        }
    }
}
