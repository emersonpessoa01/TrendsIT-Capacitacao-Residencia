using System;
using System.Threading.Tasks;
using api.data;
using Microsoft.AspNetCore.Mvc;
using api.models;
using Microsoft.EntityFrameworkCore;

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

        [HttpPost]
        public async Task<ActionResult> Cadastrar([FromBody] Pessoa pessoa)
        {
            _dc.Pessoa.Add(pessoa);
            await _dc.SaveChangesAsync();
            return Created("/api/pessoa", pessoa);
        }

        [HttpGet]
        public async Task<ActionResult> Listar()
        {
            var dados = await _dc.Pessoa.ToListAsync();
            return Ok(dados);
        }

        [HttpGet("oi")]
        public string Get()
        {
            return "Hello World!";
        }
    }
}
