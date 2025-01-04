using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AreaRetangulo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Retangulo retangulo = new Retangulo();
            Console.WriteLine("Calcula a área do retângulo: ");
            Console.WriteLine("Informe a altura: ");
            retangulo.Altura = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Informe a base: ");
            retangulo.Base = Convert.ToDouble(Console.ReadLine());
            retangulo.ExibirDados();
            Console.ReadKey();
        }
    }
}
