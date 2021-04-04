package com.applaguna.springwebstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/", "/index", ""})
    public String index(Model model) {
        model.addAttribute("titulo", "Hola Spring framework relativo");

        return "index";
    }
}
