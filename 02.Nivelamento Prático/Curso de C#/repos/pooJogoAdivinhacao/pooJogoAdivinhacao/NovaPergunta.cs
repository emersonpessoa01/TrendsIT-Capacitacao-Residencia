using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooJogoAdivinhacao
{
    public class NovaPergunta:PerguntaJogo
    {
        public NovaPergunta():base()
        {
            this.Diga = "";
        }
        public NovaPergunta(String pergunta, String resposta, String dica) :base(pergunta, resposta) //base() chama o construtor a classe base
        {
            this.Diga = dica;
        }
        public String Diga { get; set; }
    }
}
