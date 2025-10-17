
import org.junit.jupiter.api.Test;

import com.lab9.CalculadoraSegura;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSeguraIT {

    @Test
    void testSomaComValidacao() {
        CalculadoraSegura cs = new CalculadoraSegura();
        assertEquals(7, cs.somarSeguramente(3, 4));
        assertNull(cs.somarSeguramente(-1, 5));
    }
}
