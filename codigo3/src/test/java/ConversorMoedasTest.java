import org.junit.jupiter.api.Test;

import com.lab9.ConversorMoedas;

import static org.junit.jupiter.api.Assertions.*;

class ConversorMoedasTest {

    @Test
    void testConversaoValida() {
        ConversorMoedas conv = new ConversorMoedas();
        assertEquals(50.0, conv.converter("USD", "BRL", 10.0));
    }

    @Test
    void testConversaoNaoSuportada() {
        ConversorMoedas conv = new ConversorMoedas();
        assertThrows(IllegalArgumentException.class, () -> {
            conv.converter("JPY", "BRL", 100);
        });
    }

    @Test
    void testValorNegativo() {
        ConversorMoedas conv = new ConversorMoedas();
        assertThrows(IllegalArgumentException.class, () -> {
            conv.converter("USD", "BRL", -10);
        });
    }
}