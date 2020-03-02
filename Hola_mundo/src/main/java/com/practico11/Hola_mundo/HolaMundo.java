package com.practico11.Hola_mundo;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo  {
    @RequestMapping("/")
    public String hello() {
        Documento documento=new Documento();

        return documento.Texto_Cheto();
    }


}
