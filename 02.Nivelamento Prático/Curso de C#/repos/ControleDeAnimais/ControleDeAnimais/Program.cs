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
            Animal a;
            int tl = 0; //Quantidade de animais
            Animal[] animais = new Animal[20]; //Array com 10 posições

            int tlCachorro = 0, tlGato = 0, tlPeixe = 0;
            int tipoAnimal = 0;

            Console.WriteLine("Controle de animais");
            
            //Leitura da quantidade de animais
            try
            {
                Console.WriteLine("Quantos animais deseja informar (máximo 20): ");
                tl = Convert.ToInt32(Console.ReadLine());
                if (tl > 20) tl = 20;
            }
            catch
            {
                tl = 0;
            };
            for (int i = 0; i < tl; i++)
            {
                //Leitura do animal
                a = new Animal();
                Console.Write("Informe o nome do "+(i+1)+"º animal: ");
                a.Nome = Console.ReadLine();
                Console.Write("Informe o tipo de "+(i+1)+"º (Cachorro - 0, Gato - 1, Peixe - 2: )");
                //a1.Tipo = Console.ReadLine();

                try
                {
                    tipoAnimal = Convert.ToInt32(Console.ReadLine());
                    if (tipoAnimal < 0) tipoAnimal = 2;
                    if (tipoAnimal > 0) tipoAnimal = 2;
                }
                catch
                {
                    tipoAnimal = 2;
                }
                a.Tipo = (TipoAnimal)tipoAnimal;
                //Contando o tipo do formato
                if (a.Tipo == TipoAnimal.Cachorro) tlCachorro++;
                if (a.Tipo == TipoAnimal.Gato) tlGato++;
                if (a.Tipo == TipoAnimal.Peixe) tlPeixe++;

                //Armazenar o animal no vetor
                animais[i] = a;
            }




            //if (TipoAnimal == 0) a1.Tipo = TipoAnimal.Cachorro;
            //if (TipoAnimal == 1) a1.Tipo = TipoAnimal.Gato;
            //if (TipoAnimal == 2) a1.Tipo = TipoAnimal.Peixe;

            //Contando o tipo do formato
            
            //if (a1.Tipo == TipoAnimal.Cachorro) tlCachorro++;
            //if (a1.Tipo == TipoAnimal.Gato) tlGato++;
            //if (a1.Tipo == TipoAnimal.Peixe) tlPeixe++;

            //Resultado
            Console.WriteLine("Controle de animais");
            Console.WriteLine("Cachorros: " + tlCachorro + " \nGatos: " + tlGato + " \nPeixes: " + tlPeixe);
            Console.ReadKey();


        }
    }
}
