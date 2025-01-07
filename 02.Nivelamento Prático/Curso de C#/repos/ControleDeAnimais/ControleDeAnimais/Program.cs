using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ControleDeAnimais
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Animal a1 = new Animal();
            int tlCachorro = 0, tlGato = 0, tlPeixe = 0;
            int tipoAnimal = 0;

            Console.WriteLine("Controle de animais");
            Console.Write("Informe o nome do 1º animal: ");
            a1.Nome = Console.ReadLine();
            Console.Write("Informe o tipo de do 1º animal(Cachorro - 0, Gato - 1, Peixe - 2: )");
            //a1.Tipo = Console.ReadLine();

            try
            {
                tipoAnimal = Convert.ToInt32(Console.ReadLine());
                if (tipoAnimal < 0) tipoAnimal = 2;
                if (tipoAnimal > 0) tipoAnimal = 2;
            }
            catch  {
                tipoAnimal = 2;
            }

            //if (TipoAnimal == 0) a1.Tipo = TipoAnimal.Cachorro;
            //if (TipoAnimal == 1) a1.Tipo = TipoAnimal.Gato;
            //if (TipoAnimal == 2) a1.Tipo = TipoAnimal.Peixe;
            a1.Tipo = (TipoAnimal)tipoAnimal;

            //Contando o tipo do formato
            if (a1.Tipo == TipoAnimal.Cachorro) tlCachorro++;
            if (a1.Tipo == TipoAnimal.Gato) tlGato++;
            if (a1.Tipo == TipoAnimal.Peixe) tlPeixe++;
            Console.ReadKey();

            //Resultado
            Console.WriteLine("Controle de animais");
            Console.WriteLine("Cachorros: " + tlCachorro + " \nGatos:" + tlGato + " \nPeixes" + tlPeixe);


        }
    }
}
