import org.junit.jupiter.api.Test;
import com.lab9.ValidadorSenha;
import static org.junit.jupiter.api.Assertions.*;

class ValidadorSenhaTest {

    @Test
    void testValidarSenha() {
        ValidadorSenha val = new ValidadorSenha();
        assertTrue(val.validar("Senha123"));
        assertFalse(val.validar("senha123")); // falta maiúscula
        assertFalse(val.validar("SENHA"));    // falta número
        assertFalse(val.validar("123456"));   // falta letra
        assertFalse(val.validar(""));         // vazia
    }
}
