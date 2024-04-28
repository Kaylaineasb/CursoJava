package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpControler {
    @GetMapping
    public String get() {
        return "Requisição GET";
    }
    @PostMapping
    public String post(){
        return "Requisição POST";
    }
    @PutMapping
    public String put(){
        return "Requisição PUT";
    }
    @PatchMapping
    public String pacth(){
        return "Requisição Patch";
    }
    @DeleteMapping
    public String delete(){
        return "Requisição Delete";
    }
}
