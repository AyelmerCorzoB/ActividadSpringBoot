package com.ejercicio.startapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("titulo", "Funcionando");
        model.addAttribute("desc", "Bienvenido a la página de inicio.");
        return "index";
    }
    
}
