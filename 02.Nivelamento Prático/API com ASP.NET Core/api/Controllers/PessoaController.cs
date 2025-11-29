using System;
using System.Threading.Tasks;
using api.data;
using Microsoft.AspNetCore.Mvc;
using api.models;

namespace api.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class PessoaController : ControllerBase
    {
        private readonly DataContent _dc;

        public PessoaController(DataContent context)
        {
            _dc = context;
        }

        [HttpPost("api")]
        public async Task<ActionResult> Cadastrar([FromBody] Pessoa pessoa)
        {
            _dc.Pessoa.Add(pessoa);
            await _dc.SaveChangesAsync();
            return Created("/pessoa", pessoa);
        }

       
        [HttpGet("oi")]
        public string Get()
        {
            return "Hello World!";
        }
    }
}
