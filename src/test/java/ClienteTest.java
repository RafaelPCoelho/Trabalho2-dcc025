import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarNomeCliente(){
        Cliente cliente1 = new Cliente("Marco", "123");
        assertEquals("Marco", cliente1.getNome());
    }

    @Test
    void deveRetornarCpfCliente(){
        Cliente cliente1 = new Cliente("Marco", "123");
        assertEquals("123", cliente1.getCpf());
    }

    @Test
    void deveRetornarExcecaoCpf(){
        try {
            Cliente cliente = new Cliente("Marco", null);
            fail();
        }catch (IllegalArgumentException  e){
            assertEquals("Falta informar o cpf", e.getMessage());
        }
    }
}