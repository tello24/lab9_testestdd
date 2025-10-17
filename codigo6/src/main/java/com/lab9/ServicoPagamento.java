package com.lab9;

public class ServicoPagamento {
    // Regra simples: paga se o valorPago >= valor do pedido
    public boolean processarPagamento(Pedido pedido, double valorPago) {
        if (valorPago > pedido.getValor()) {
            pedido.marcarPago();
            return true;
        }
        return false;
    }
}
