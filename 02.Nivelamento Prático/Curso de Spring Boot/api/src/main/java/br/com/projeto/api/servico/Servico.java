package br.com.projeto.api.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import br.com.projeto.api.model.Mensagem;
import br.com.projeto.api.model.Pessoa;
import br.com.projeto.api.repository.ServicoRepository;

@Service

public class Servico {
    @Autowired
    private Mensagem mensagem;

    @Autowired
    private ServicoRepository repository;

    // Método para cadastrar pessoa
    public ResponseEntity<?> cadastrar(Pessoa pessoa) {

        if (pessoa.getNome().equals("")) {
            mensagem.setMensagem("O nome não pode ser vazio");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        } else if (pessoa.getIdade() < 0) {
            mensagem.setMensagem("Informe uma idade válida");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        } else {
            // Caso tenha um nome e idade de zero ou superior
            // repository.save(pessoa); //Gera todos os dados da Pessoa
            return new ResponseEntity<>(repository.save(pessoa), HttpStatus.CREATED);
        }
    }

    // Método para listar pessoas
    public ResponseEntity<?> selecionar() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    // Método para selecionar pessoa pelo código
    public ResponseEntity<?> selecionarPeloCodigo(int codigo) {
        if(repository.countByCodigo(codigo)== 0){
            mensagem.setMensagem("Não foi encontrada nenhuma pessoa");
            return new ResponseEntity<>(mensagem,HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(repository.findByCodigo(codigo), HttpStatus.OK);
        }
    }
    // Método para editar dados
    public ResponseEntity<?> editar(Pessoa pessoa){
        //Será procurado alguém com o código 
        if(repository.countByCodigo(pessoa.getCodigo())==0){
            mensagem.setMensagem("O código informado não existe");
            return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND);
        }else if(pessoa.getNome().equals("")){
            mensagem.setMensagem("É necessário informar um nome");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else if(pessoa.getIdade()<0){
            mensagem.setMensagem("Informe uma idade válida");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }
        else{
            return new ResponseEntity<>(repository.save(pessoa),HttpStatus.OK);
        }
    }

}