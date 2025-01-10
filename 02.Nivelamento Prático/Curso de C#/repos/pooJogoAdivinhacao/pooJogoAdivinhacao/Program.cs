using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooJogoAdivinhacao
{
    public class Program
    {
        static void Main(string[] args)
        {
            //Listas de perguntas
            List<NovaPergunta> perguntas;
            perguntas = CriarPerguntas();

            //Pergunta que será exibida para o usuário
            Random r = new Random();
            int posicao = r.Next(0, perguntas.Count); //Perguntas começam no índice 0 entre o total de perguntas
            NovaPergunta pergunta = perguntas[posicao];

            //Lógica para o usuário responder a pergunta
            int tentativas = 0;
            bool flag = false;
            String resposta = "";
            while (tentativas < 3 && flag == false) {
                Console.WriteLine($"Pergunta: {pergunta.Pergunta}");
                Console.WriteLine("Digite sua resposta: ");
                resposta = Console.ReadLine();
                resposta = resposta.ToUpper();
                if (resposta == pergunta.Resposta)
                {
                    flag = true;
                }
                else
                {
                    Console.WriteLine($"Errou!!! Dica: {pergunta.Diga}");

                }

                tentativas++;
                
            }
            if (flag == true) {
                Console.WriteLine("Parabéns!!! Você ganhou o jogo");
            }
            else
            {
                Console.WriteLine("Que pena!!! Você 0perdeu o jogo");

            }
            Console.ReadKey();

        }
        static List<NovaPergunta> CriarPerguntas()
        {
            List<NovaPergunta> lista = new List<NovaPergunta>(10); // 10 é o número de perguntas.
            lista.Add(new NovaPergunta("Qual é a cor do céu", "Azul", "Informe uma cor que comece com a letra A"));
            lista.Add(new NovaPergunta("Qual é o endereço do site de dfilitto", "https://www.dfilitto.com.br", "www + o nome da pergunta+ .com.br"));
            lista.Add(new NovaPergunta("Aplicativo de assistir filmes", "Netflix", "O aplicativo mais utilizado do momento"));
            lista.Add(new NovaPergunta("Qual é o maior planeta do sistema solar", "Júpiter", "O nome do planeta começa com a letra J"));
            lista.Add(new NovaPergunta("Qual é o animal considerado o rei da selva", "Leão", "O nome do animal começa com a letra L"));
            lista.Add(new NovaPergunta("Qual é o país conhecido pela Torre Eiffel", "França", "País europeu cuja capital é Paris"));
            lista.Add(new NovaPergunta("Qual é o idioma mais falado no mundo", "Inglês", "Idioma oficial em diversos países, incluindo os EUA e o Reino Unido"));
            lista.Add(new NovaPergunta("Qual é a fórmula química da água", "H2O", "Duas moléculas de hidrogênio e uma de oxigênio"));
            lista.Add(new NovaPergunta("Qual é o maior oceano do mundo", "Oceano Pacífico", "Oceano que fica entre a América e a Ásia"));
            lista.Add(new NovaPergunta("Quem pintou a Mona Lisa", "Leonardo da Vinci", "Famoso artista renascentista italiano"));;
            return lista;

        }
    }
}
