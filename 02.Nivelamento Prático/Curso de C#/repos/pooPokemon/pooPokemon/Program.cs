using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooPokemon
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Pokemon pokemon = new Pokemon("Bulbasauro", "Bulbasauro é um pokemon tipo planta...");
            //Pokemon pokemon = new Pokemon();
            //pokemon.Nome = "Bulbasauro";
            //pokemon.Descricao = "Bulbasauro é um pokemon tipo planta...";
            //pokemon.ExibirDaddos(true);

            Pokedex pokedex = new Pokedex();
            Pokemon p = pokedex.Pokemons[1];
            p.ExibirDaddos();
            Console.ReadKey();
        }
    }
}
