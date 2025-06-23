package com.calango.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/Alo")

public class AloController {

    //requsição e resposta (REQUEST E RESPONSE)
    @GetMapping
    public String aloMundo(){
        return "Alo Mundo - JKalango!";

    }
    
}
