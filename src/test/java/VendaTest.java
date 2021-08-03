import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {
    @Test
    void deveRetornarTrueEstoqueInsuficiente(){
        Produto produto1 = new Produto("Caneta", 100, 1.2F, 10, 200);
        assertTrue(produto1.verificarEstoqueExcedente(200));
    }

    @Test
    void deveRetornarFalseEstoqueInsuficiente(){
        Produto produto1 = new Produto("Caneta", 100, 1.2F, 10, 200);
        assertFalse(produto1.verificarEstoqueExcedente(95));
    }

    @Test

    void deveRetornarExcecaoClienteNulo(){
        try {
            Produto produto1 = new Produto("Caneta", 100, 1.2F, 100, 200);
            Venda venda1 = new Venda("04/08/21",null,produto1,100000000);
            fail();
        }catch (IllegalArgumentException  e){
            assertEquals("Algum parametro null", e.getMessage());
        }
    }
}