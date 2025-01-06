using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exemploENUM
{
    internal class Program
    {
        enum mes
        {
            Janeiro,
            Fevereiro,
            Março,
            Abril,
            Maio,
            Junho,
            Julho,
            Agosto,
            Setembro,
            Outubro,
            Novembro,
            Dezembro
        };
        static void Main(string[] args)
        {
            //mes aniversario = mes.Janeiro;
            mes aniversario = (mes)0;
            Console.WriteLine("O mês do meu aniversário é no mês: " + aniversario);
            Console.ReadKey();
        }
    }
}
