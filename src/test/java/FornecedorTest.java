//RAFAEL FIALHO PINTO COELHO MATRICULA: 201965573C
//WELLINGTON PEREIRA SILVA MATRICULA: 201935041

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

    @Test
    void deveRetornarExcecaoCnpj(){
        try {
            Fornecedor fornecedor = new Fornecedor("Tambasa", null);
            fail();
        }catch (IllegalArgumentException  e){
            assertEquals("Falta informar o cnpj", e.getMessage());
        }
    }

}