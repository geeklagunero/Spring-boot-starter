package com.applaguna.springwebstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    //el nombre de la variable que se usa desde el html es el otro
    //y el nombre de la variable dentro de los metodos de llama es el texto
    //el required es que no tiene que ir forzosamente
    @GetMapping("/string")
    public String param(@RequestParam(name="otro", required = false, defaultValue = "valor por default") String texto, Model model){
        model.addAttribute("resultaado", "el texto enviado es " + texto);
        return "params/ver";
    }

}
