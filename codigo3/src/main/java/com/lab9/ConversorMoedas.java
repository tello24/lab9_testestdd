package com.lab9;
import java.util.HashMap;
import java.util.Map;

public class ConversorMoedas {
    private final Map<String, Double> taxas = new HashMap<>();

    public ConversorMoedas() {
        taxas.put("USD_BRL", 5.0);
        taxas.put("EUR_BRL", 6.0);
    }

    public double converter(String de, String para, double valor) {
        if (valor < 0) 
            throw new IllegalArgumentException("Valor não pode ser negativo");

        String chave = de + "_" + para;
        if (!taxas.containsKey(chave)) 
            throw new IllegalArgumentException("Conversão não suportada");

        return -1;
    }
}