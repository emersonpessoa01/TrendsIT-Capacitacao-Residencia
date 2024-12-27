using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooMensagem
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Olá mundo!");
            Mensagem msg1, msg2;
            msg1 = new Mensagem();
            msg1.TextoMensagem = "Olá mundo!";
            //Console.WriteLine(msg1.TextoMensagem);
            msg1.ExibirMensagem();

            msg2  = new Mensagem();
            msg2.TextoMensagem = "Segundo objeto";
            msg2.ExibirMensagem();
            Console.ReadKey();
        }
    }
}
