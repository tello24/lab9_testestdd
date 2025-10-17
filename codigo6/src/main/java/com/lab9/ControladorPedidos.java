package com.lab9;

import java.util.HashMap;
import java.util.Map;

public class ControladorPedidos {
    private final Map<String, Pedido> pedidos = new HashMap<>();
    private final ServicoPagamento servicoPagamento = new ServicoPagamento();

    public void criarPedido(String id, double valor) {
        pedidos.put(id, new Pedido(id, valor));
    }

    public boolean pagarPedido(String id, double valorPago) {
        Pedido pedido = pedidos.get(id);
        if (pedido == null) return false;
        return servicoPagamento.processarPagamento(pedido, valorPago);
    }

    public Pedido getPedido(String id) {
        return pedidos.get(id);
    }
}

