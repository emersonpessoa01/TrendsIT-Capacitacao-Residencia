using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooPerguntaEResposta
{
    public class PerguntaPlus : Pergunta
    {
        public PerguntaPlus():base() //base() vai executaro construtor base que é Pergunta()
        {
            
            this.Dica = "";
        }
        public PerguntaPlus(String texto, String resposta, String dica):base(texto, resposta)
        {
            
            this.Dica = dica;
        }
        public String Dica { get; set; }
    }
}
