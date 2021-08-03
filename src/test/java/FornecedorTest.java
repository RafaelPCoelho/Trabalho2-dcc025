import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {

    @Test
    void deveRetornarNomeFornecedor(){
        Fornecedor fornecedor1 = new Fornecedor("Marco","213213");
        assertEquals("Marco", fornecedor1.getNome());
    }
    @Test
    void deveRetornarCnpjFornecedor(){
        Fornecedor fornecedor1 = new Fornecedor("Marco","213213");
        assertEquals("213213", fornecedor1.getCnpj());
    }

}