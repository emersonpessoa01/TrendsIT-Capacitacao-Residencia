package br.com.projeto.api.servico;

import org.springframework.data.jpa.repository.JpaRepository;
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

    public ResponseEntity<?> cadastrar(Pessoa pessoa) {

        if (pessoa.getNome().equals("")) {
            mensagem.setMensagem("O nome não pode ser vazio");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        } else if (pessoa.getIdade() < 0) {
            mensagem.setMensagem("Informe uma idade válida");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else{
            //Caso tenha um nome e idade  de zero ou superior
            // repository.save(pessoa); //Gera todos os dados da Pessoa 
            return new ResponseEntity<>(repository.save(pessoa),HttpStatus.CREATED);
        }
    }
}