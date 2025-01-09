using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooPerguntaEResposta
{
    public class Program
    {
        static void Main(string[] args)
        {
            PerguntaPlus p = new PerguntaPlus();
            p.Texto = "Qual´é o site possui um ótimo conteúdo sobre programação?";
            p.Resposta = "https://www.dfilitto.com.br";
            p.Dica = "O mantenedor do site é o Danilo Fillito";

            Console.WriteLine("Tente adivinhar a pergunta");
            Console.WriteLine("Pergunta: "+ p.Texto);
            Console.WriteLine("Dica: "+ p.Dica);
            Console.Write("Resposta: ");
            String resposta = Console.ReadLine();

            if (p.Resposta.ToUpper() == resposta.ToUpper()) {
                Console.WriteLine("Parabéns!!! Você acertou.");
            }
            else
            {
                Console.WriteLine("Que pena!!! Você errou");
                Console.WriteLine("A resposta correta é: "+ p.Resposta);
            }
            Console.ReadKey();
        }
    }
}
