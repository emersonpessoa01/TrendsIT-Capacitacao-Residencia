using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooMensagem
{
    public class Mensagem
    {
        //private String TextoMensagem;

        //public void ExibirMensagem()
        //  {
        //      Console.WriteLine(this.TextoMensagem);

        //  }

        //Encapsulamento
        //Métodos de acesso da classe 
        //public String getTextoMensagem()
        //{
        //    return this.TextoMensagem; // 'this' serve para interagir com algo que é do próprio objeto

        //}
        //public void setTextoMensagem(String textoMensagem)
        //{
        //    this.TextoMensagem = textoMensagem.ToUpper();
        //}


        private String textoMensagem;
        public String TextoMensagem
        {
            get { 
                return textoMensagem;
            }
            set { 
                textoMensagem = value; 
            }
           
        }

        public void ExibirMensagem()
        {
            Console.WriteLine(this.TextoMensagem);

        }

    }
}
