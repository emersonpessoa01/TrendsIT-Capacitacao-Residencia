package br.com.api.produtos.servico;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.modelo.RespostaModelo;
import br.com.api.produtos.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
    // Implementações dos métodos do ProdutoServico
    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Autowired
    private RespostaModelo respostaModelo;

    // Método para listar todos os produtos
    // Iterable é uma interface que representa uma coleção de elementos.
    // E toda lista que tem um tipo de dado que pode ser retornado
    public Iterable<ProdutoModelo> listar() {
        return produtoRepositorio.findAll();
    }

    // Método para salvar um produto
    public ResponseEntity<?> cadastrar(ProdutoModelo produtoModelo) {
        if (produtoModelo.getNome().equals("")) {
            respostaModelo.setMensagem("O nome do produto é obrigatório!");
            return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.BAD_REQUEST);
        } else if (produtoModelo.getMarca().equals("")) {
            respostaModelo.setMensagem("A marca do produto é obrigatória!");
            return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<ProdutoModelo>(produtoRepositorio.save(produtoModelo), HttpStatus.CREATED);
        }
        
    }
}
