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
            //msg1.TextoMensagem = "Olá mundo!";

            //Encapsulamento
            msg1.setTextoMensagem("Olá mundo");
            //Console.WriteLine(msg1.TextoMensagem);
            //msg1.ExibirMensagem();
            Console.WriteLine(msg1.getTextoMensagem());

            msg2  = new Mensagem();
            //Encapsulamento
            //msg2.TextoMensagem = "Segundo objeto";
            msg2.setTextoMensagem("Segundo objeto");
            //msg2.ExibirMensagem();
            Console.WriteLine(msg2.getTextoMensagem());
            Console.ReadKey();
        }
    }
}
