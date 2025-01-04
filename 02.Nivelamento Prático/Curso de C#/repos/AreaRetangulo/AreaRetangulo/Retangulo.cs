using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AreaRetangulo
{
    internal class Retangulo

    {
       
        public Retangulo()
        {
            this.Altura = 0;
            this.Base = 0;
        }

        //Base do retângulo
        private double baseret;

        public double Base
        {
            get { return baseret; }
            set
            {
                if (value >= 0)
                    baseret = value;
                else baseret = 0;
            }
        }
        //Altura do retângulo
        private double altret;
        public double Altura
        {
            get { return altret; }
            set
            {
                if (value >= 0)
                    altret = value;
                else altret = 0;
            }
        }

        public double Area
        {
            get
            {
                return baseret * altret;
            }
        }

        public void ExibirDados()
        {
            Console.WriteLine("Base: "+ this.Base);
            Console.WriteLine("Altura: "+ this.Altura);
            Console.WriteLine("Area: "+ this.Area);
        }

    }
}
