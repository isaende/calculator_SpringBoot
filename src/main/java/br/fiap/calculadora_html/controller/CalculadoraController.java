package br.fiap.calculadora_html.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/calculator")

public class CalculadoraController {
    @GetMapping("/sum")
    public int sum(int a, int b){
        return a + b;
    }
}
