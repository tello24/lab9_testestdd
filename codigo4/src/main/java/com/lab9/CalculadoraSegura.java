package com.lab9;

public class CalculadoraSegura {
    private final ValidadorEntrada validador = new ValidadorEntrada();
    private final Calculadora calc = new Calculadora();

    public Integer somarSeguramente(int a, int b) {
        if (!validador.validar(a, b)) return null;
        return calc.somar(a, b);
    }
}