package com.calango.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/fases")

public class FasejogoController {
    @GetMapping

    public int mostrarQtldeFases(){
        return 7;
    }

}
