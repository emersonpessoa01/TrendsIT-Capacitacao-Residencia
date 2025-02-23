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
    //Iterable é uma interface que representa uma coleção de elementos.
    //E toda lista que tem um tipo de dado que pode ser retornado
    public Iterable<ProdutoModelo> listar() {
        return produtoRepositorio.findAll();
    }
}
