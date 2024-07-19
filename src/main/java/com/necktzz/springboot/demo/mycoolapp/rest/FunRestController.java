package com.necktzz.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    //mapeamento da web atraves da / e fazendo o get do que estiver dentro da classe, ou seja, aqui esta o hello world
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/spring")
    public String sayHiSpring() {
        return "HI SPRING!";
    }
}

