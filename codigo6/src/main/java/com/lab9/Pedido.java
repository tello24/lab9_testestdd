package com.lab9;

public class Pedido {
    private final String id;
    private final double valor;
    private boolean pago;

    public Pedido(String id, double valor) {
        this.id = id;
        this.valor = valor;
        this.pago = false;
    }

    public String getId() { return id; }
    public double getValor() { return valor; }
    public boolean isPago() { return pago; }

    public void marcarPago() { this.pago = true; }
}
