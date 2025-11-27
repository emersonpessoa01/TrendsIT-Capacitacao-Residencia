using System.ComponentModel.DataAnnotations;

namespace api.models
{
    public class Pessoa
    {
        [Key]
        public int Id { get; set; }
        public string Nome { get; set; }
        public int Idade { get; set; }
        public int Cidade { get; set; }
    }
}