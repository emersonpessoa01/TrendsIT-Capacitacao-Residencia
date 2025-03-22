using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RacingGame
{
    public class Pista
    {
        public Pista(int tamanho, Corredor atleta)
        {
            this.Tamanho = tamanho;
            this.Atleta = atleta;
            this.posAtleta = 0;
          

        }
        public int Tamanho { get; set; }

        private int posAtleta; // Change posAtleta to int
        public int PosAtleta // Change PosAtleta to int
        {
            get
            {
                return this.posAtleta;
            }
        }
        public Corredor Atleta { get; set; }
        public void AtualizarCorrida()
        {
            this.posAtleta += this.Atleta.Correr();
        }
        public void ExibirPista()
        {
            String pista = ""; //Inicia a pista vazia
            String corredorPista = ""; //Inicia o corredor na pista vazia
            for (int i = 0; i <= this.Tamanho; i++)
            {
                pista += "_"; //Monta a pista
                if (i == this.posAtleta)
                {
                    corredorPista += this.Atleta.Nome; //Monta o corredor na pista
                }
                else
                {
                    corredorPista += " "; //Monta o corredor na pista
                }
            }
            Console.WriteLine(corredorPista); //Imprime o corredor na pista
            Console.WriteLine(pista); //Imprime a pista
        }
    }
}
    
