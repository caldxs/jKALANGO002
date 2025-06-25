package com.calango.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcalango.api.jogadores.DadosCadastrarJogador;
import com.jcalango.api.jogadores.JogadorRepository;

@RestController
@RequestMapping("/Jogador")


public class JogadorController {

    // o que é Injeção de Dependência?
@Autowired
private JogadorRepository repository;
    @PostMapping
    public void cadastrar (@RequestBody DadosCadastrarJogador dados){
        //System.out.println(dados);
    repository.save( new Jogador(null,dados.nome(),dados.nickNome(),dados.email(),dados.celular(),dados.senha()));
        
        

    }

}
