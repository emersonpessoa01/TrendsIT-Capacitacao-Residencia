package br.com.projeto.api.model;

import org.springframework.stereotype.Component;

//@Component
// Serve para criar uma resposta quando houver algum erro em nossas requisições
@Component
public class Mensagem {
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    

}
