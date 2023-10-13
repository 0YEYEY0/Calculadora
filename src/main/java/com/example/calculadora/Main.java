package com.example.calculadora;

public class Main {
    public static void main(String[] args) {
        String expresion = "(2 ** 3) % 5"; // Ejemplo con operadores de exponenciación y módulo
        ArbolExpresion arbol = new ArbolExpresion(expresion);
        double resultado = arbol.evaluar();
        System.out.println("Resultado: " + resultado);
    }
}


