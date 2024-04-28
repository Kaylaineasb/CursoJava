package com.example.demo.controllers;

import com.example.demo.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @GetMapping(path="/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28,"Pedro","1234567-00");
    }
    @GetMapping("/{id}")
    public Cliente obterCLientePorId1(@PathVariable int id){
        return new Cliente(id,"Maria","987-654-321-00");
    }
    @GetMapping
    public Cliente obterClientePorId2(
            @RequestParam(name="id") int id){
        return  new Cliente(id,"João","111.222.333-44");
    }
}
