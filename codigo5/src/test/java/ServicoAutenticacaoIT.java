import org.junit.jupiter.api.Test;

import com.lab9.RepositorioUsuarios;
import com.lab9.ServicoAutenticacao;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAutenticacaoIT {

    @Test
    void testAutenticacaoCompleta() {
        RepositorioUsuarios repo = new RepositorioUsuarios();
        repo.salvar("Alice", "1234");
        ServicoAutenticacao servico = new ServicoAutenticacao(repo);

        assertTrue(servico.autenticar("Alice", "1234"));
        assertFalse(servico.autenticar("Alice", "0000"));
        assertFalse(servico.autenticar("Bob", "1234"));
    }
}