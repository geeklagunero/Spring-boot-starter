package com.applaguna.springwebstarter.controllers;

import com.applaguna.springwebstarter.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/", "/index", ""})
    public String index(Model model) {
        model.addAttribute("titulo", "Hola Spring framework relativo");

        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("andres");
        usuario.setApellido("Apellido");
        usuario.setEmail("usuario@gmail.com");
        model.addAttribute("titulo", "Perfil de usuario: ".concat(usuario.getNombre()));
        model.addAttribute("usuario", usuario);
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model){
        List<Usuario> usuarios = new ArrayList<>();
        model.addAttribute("titulo", "Listado de Usuarios");
        model.addAttribute("usuarios", usuarios);
        return "listar";
    }
}
