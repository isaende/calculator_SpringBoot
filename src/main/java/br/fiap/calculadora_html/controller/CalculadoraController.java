package br.fiap.calculadora_html.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController

@RequestMapping("/calculator")

public class CalculadoraController {
    @GetMapping("/sum")
    public int sum(int a, int b){
        return a + b;
    }

    @GetMapping("/subtraction")
    public int subtration(int a, int b){
        return a - b;
    }

    @GetMapping("/multiplication")
    public int multiplication(int a, int b){
        return a * b;
    }

    @GetMapping("/division")
    public double division(int a, int b){
        if (b==0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error: there is no 0 division");
        }
        return (double) a / b;
    }
}
