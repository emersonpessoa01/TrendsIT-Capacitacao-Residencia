using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooPerguntaEResposta
{
    public class Pergunta
    {
        //public String testeA;
        //private String testeB;
        //protected String testeC;
        public Pergunta()
        {
            this.Texto = "";
            this.Resposta = "";
        }
        public Pergunta(String texto, String resposta)
        {
            this.Texto= texto;
            this.Resposta = resposta;
        }
        public string Texto { get; set; }
        public String Resposta { get; set; }

    }
}
     