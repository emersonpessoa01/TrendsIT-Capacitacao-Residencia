package br.com.api.produtos.servico;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
    // Implementações dos métodos do ProdutoServico
    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    // Método para listar todos os produtos
    public Iterable<ProdutoModelo> listar() {
        return produtoRepositorio.findAll();
    }
}
