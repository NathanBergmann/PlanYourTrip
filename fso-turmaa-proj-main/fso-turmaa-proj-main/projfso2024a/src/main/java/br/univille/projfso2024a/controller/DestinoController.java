package br.univille.projfso2024a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/destinos")
public class DestinoController {
 
    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("destino/index");
    }
}
