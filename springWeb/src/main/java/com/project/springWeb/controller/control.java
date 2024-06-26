package com.project.springWeb.controller;

import com.project.springWeb.ProductModel.Pessoa;
import com.project.springWeb.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class control {

    @Autowired
    private ProductRepository acao;

    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa dados){
        return acao.save(dados);
    }

    @GetMapping("/exibir")
    public Iterable<Pessoa> exibir(){
        return acao.findAll();
    }

    @GetMapping("/exibir/{id}")
    public Pessoa selecionar(@PathVariable int id){
        return acao.findByid(id);
    }


    @GetMapping("/index")
    public String telaInicial(){
        return "Hello World!";
    }

    @GetMapping("/about")
    public String sobre(){
        return "Ola mundo!";

    }



}
