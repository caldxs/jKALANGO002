package com.calango.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcalango.api.jogadores.DadosCadastrarJogador;

@RestController
@RequestMapping("/Jogador")


public class JogadorController {
    @PostMapping
    public void cadastrar (@RequestBody DadosCadastrarJogador dados){
        System.out.println(dados);
    }

}
