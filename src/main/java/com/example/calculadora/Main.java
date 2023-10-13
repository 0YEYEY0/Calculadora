package com.example.calculadora;

public class Main {
    public static void main(String[] args) {
        String expresion = "(5 * (10 - 15)) + 7";
        ArbolExpresion arbol = new ArbolExpresion(expresion);
        double resultado = arbol.evaluar();
        System.out.println("Resultado: " + resultado);
    }
}

