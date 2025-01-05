using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooPokemon
{
    public class Pokedex
    {
        //Construtor
        public Pokedex()
        {
            this.InicializaLista();
        }
        private List<Pokemon> pokemons;

		public List<Pokemon> Pokemons
		{
			get { 
				return pokemons; 
			}
			
		}

		private void InicializaLista()
		{
			//Instanciar a lista
			this.pokemons = new List<Pokemon>();
			
			Pokemon p = new Pokemon("Bulbasauro","pokemon tipo planta"); //cria um objeto e uma nova área na memória
			this.pokemons.Add(p); //Salva dentro da lista

			p = new Pokemon("Mew", "lendário psíquico");
            this.pokemons.Add(p);

            p = new Pokemon("MewTwo", "lendário psíquico");
            this.pokemons.Add(p);

            p = new Pokemon("Giratina", "lendário fantasma");
            this.pokemons.Add(p);

            p = new Pokemon("Flygon", "pokemon dragão");
            this.pokemons.Add(p);

            p = new Pokemon("Metagross", "pokemon metal");
            this.pokemons.Add(p);

            p = new Pokemon("Muk", "pokemon metal");
            this.pokemons.Add(p);

            p = new Pokemon("Lucario", "lutador lendariownnabe");
            this.pokemons.Add(p);

            p = new Pokemon("Mudkip", "pokemon de agua");
            this.pokemons.Add(p);

            p = new Pokemon("Paras", "pokemon inseto");
            this.pokemons.Add(p);

            p = new Pokemon("Kyogre", "lendario da água");
            this.pokemons.Add(p);
        }
	}
}
