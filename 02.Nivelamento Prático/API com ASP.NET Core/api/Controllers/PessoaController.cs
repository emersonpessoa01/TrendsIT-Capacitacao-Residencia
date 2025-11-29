using System.Threading.Tasks;
using api.data;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;


namespace api.Controllers
{
    [Controller]
    [Route("[controller]")]
    public class PessoaController
    {
        [HttpGet("Oi")]
        public string Get()
        {
            return "Hello World!";
        }
    }
}