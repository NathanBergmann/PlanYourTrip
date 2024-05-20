package br.univille.projfso2024a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projfso2024a.entity.Atividade;
import br.univille.projfso2024a.service.AtividadeService;

@Controller
@RequestMapping("/atividades")
public class AtividadeController {
    
    @Autowired
    private AtividadeService service;

    @GetMapping
    public ModelAndView index(){
        var listaAtividades = service.getAll();
        return new ModelAndView("atividade/index","listaAtividades",listaAtividades);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var atividade = new Atividade();
        return new ModelAndView("atividade/form","atividade",atividade);
    }

    @PostMapping
    public ModelAndView save(Atividade atividade){
        service.save(atividade);
        return new ModelAndView("redirect:/atividades");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var atividade = service.getById(id);
        return new ModelAndView("atividade/form", "atividade",atividade);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/atividades");
    }

}
