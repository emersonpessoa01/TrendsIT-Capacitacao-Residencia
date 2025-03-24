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
            Boolean ganhou = false;
            string resp = "s";
            int aposta = 0;
            int ganhador = 0;

            while (resp == "s")
            {
                //Enquanto a posição do corredor for menor que o tamanho da pista(Está mandando o corredor correr)
                Pista pista1 = new Pista(100, new Corredor("e"));
                Pista pista2 = new Pista(100, new Corredor("p"));
                Pista pista3 = new Pista(100, new Corredor("s"));

                Console.Clear(); //Limpa a tela 
                Console.WriteLine("$#@ - Corrida Maluca - @#$");
                Console.WriteLine("Corredores \n1 - Emerson (e)\n2 - Pessoa (p)\n3 - Silva (s)");
                Console.Write("Em qual corredor você aposta (1, 2 ou 3): ");
                aposta = Convert.ToInt32(Console.ReadLine());
                ganhador = 0;
                ganhou = false;
                while (ganhou == false)
                {
                    Console.Clear();
                    if (pista1.AtualizarCorrida() == true)
                    {
                        ganhador = 1;
                        ganhou = true;
                    }
                    if (pista2.AtualizarCorrida() == true)
                    {
                        ganhador = 2;
                        ganhou = true;
                    }
                    if (pista3.AtualizarCorrida() == true)
                    {
                        ganhador = 3;
                        ganhou = true;
                    }
                    pista1.ExibirPista();
                    pista2.ExibirPista();
                    pista3.ExibirPista();
                    System.Threading.Thread.Sleep(1000);
                }
                Console.Clear();
                Console.WriteLine("$#@ - Corrida Maluca - @#$");
                Console.WriteLine($"O ganhador foi o corredor de número {ganhador}");
                switch (ganhador)
                {
                    case 1:
                        Console.WriteLine("Emerson (e)");
                        break;
                    case 2:
                        Console.WriteLine("Pessoa (p)");
                        break;
                    case 3:
                        Console.WriteLine("Silva (s)");
                        break;
                }
                if (ganhador == aposta)
                {
                    Console.WriteLine("Parabéns!!!! Você ganhou!!!!!");
                }
                else
                {
                    Console.WriteLine("Que pena!!!! Você perdeu!!!!!");
                }
                Console.Write("Jogar novamente S ou N:");
                resp = Console.ReadLine().ToLower();
            }
        }
    }
}
