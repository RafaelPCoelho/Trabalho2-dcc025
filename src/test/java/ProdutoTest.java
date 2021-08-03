import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

            /*
        @Test
        void deveRetornarTrueProdutoExcedente(){
            Produto produto1 = new Produto("Caneta", 100, 1.2F, 10, 200);
            assertTrue(produto1.verificarEstoqueExcedente(200));
        }

        @Test
        void deveRetornarFalseProdutoExcedente(){
            Produto produto1 = new Produto("Caneta", 100, 1.2F, 10, 200);
            assertFalse(produto1.verificarEstoqueExcedente(95));
        } */



    @Test
        void deveRetornaNomeProduto(){
            Produto produto1 = new Produto("Caneta", 100, 1.2F, 10, 200);
            assertEquals("Caneta",produto1.getNome());
        }

        @Test
        void deveDebitarEstoque(){
            Produto produto1 = new Produto("Caneta", 100, 1.2F, 10, 200);
            Cliente cliente1 = new Cliente("Marcos","123");
            produto1.vender("04/08/21",cliente1,2);
            assertEquals(98,produto1.getQtdeEstoque());
        }
}