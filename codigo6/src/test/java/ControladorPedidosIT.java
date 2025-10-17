import org.junit.jupiter.api.Test;

import com.lab9.ControladorPedidos;

import static org.junit.jupiter.api.Assertions.*;

public class ControladorPedidosIT {

    @Test
    void testFluxoCompletoDePagamento() {
        ControladorPedidos ctrl = new ControladorPedidos();

        ctrl.criarPedido("P1", 100.0);
        assertFalse(ctrl.getPedido("P1").isPago());

        boolean sucesso = ctrl.pagarPedido("P1", 120.0);
        assertTrue(sucesso);
        assertTrue(ctrl.getPedido("P1").isPago());
    }

    @Test
    void testPagamentoInsuficiente() {
        ControladorPedidos ctrl = new ControladorPedidos();

        ctrl.criarPedido("P2", 200.0);
        boolean sucesso = ctrl.pagarPedido("P2", 150.0);
        assertFalse(sucesso);
        assertFalse(ctrl.getPedido("P2").isPago());
    }
}
