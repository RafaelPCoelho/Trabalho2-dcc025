import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {


    @Test
    void deveRetornarExcecaoNome(){
        try{
            Produto produto1 = new Produto(null, 100, 2, 100, 200);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Falta parametro no produto", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoQtdeEstoque(){
        try{
            Produto produto1 = new Produto("Caneta", null, 2, 100, 200);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Falta parametro no produto", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoPrecoUnit(){
        try{
            Produto produto1 = new Produto("Caneta", 100, null, 100, 200);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Falta parametro no produto", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoEstoqueMinimo(){
        try{
            Produto produto1 = new Produto("Caneta", 100, 2, null, 200);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Falta parametro no produto", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoEstoqueMaximo(){
        try{
            Produto produto1 = new Produto("Caneta", 100, 2, 100, null);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Falta parametro no produto", e.getMessage());
        }
    }


    @Test
    void deveRetornarHistoricoCompra(){
        Produto produto = new Produto("Caneta", 100, 2, 10, 200);
        produto.comprar("04/08/2021", new Fornecedor("Tambasa", "1234"), 20, 1.2F );

        List<String> lista = Arrays.asList("Compra do produto Caneta");

        assertEquals(lista, produto.exibirHistorico());
    }

    @Test
    void deveRetornarHistoricoVenda(){
        Produto produto = new Produto("Caneta", 100, 2, 10, 200);
        produto.vender("04/08/2021", new Cliente("Antonio", "1234"), 50 );

        List<String> lista = Arrays.asList("Valor da venda = 100.0", "Venda do produto Caneta");

        assertEquals(lista, produto.exibirHistorico());
    }


    @Test
    void deveRetornarTrueEstoqueBaixo(){
        Produto produto1 = new Produto("Caneta",5, 2, 10, 200);
        assertTrue(produto1.verificarEstoqueBaixo());
    }

    @Test
    void deveRetornarFalseEstoqueBaixo(){
        Produto produto1 = new Produto("Caneta", 100, 2, 10, 200);
        assertFalse(produto1.verificarEstoqueBaixo());
    }

    @Test
    void deveRetornarTrueEstoqueInsuficiente(){
        Produto produto1 = new Produto("Caneta", 100, 2, 10, 200);
        assertFalse(produto1.verificarEstoqueInsuficiente(95));
    }

    @Test
    void deveRetornarFalseEstoqueInsuficiente(){
        Produto produto1 = new Produto("Caneta", 100, 2, 10, 200);
        assertTrue(produto1.verificarEstoqueInsuficiente(101));
    }

    @Test
    void deveRetornarTrueEstoqueExcedente(){
        Produto produto1 = new Produto("Caneta", 100 , 2, 10, 200);
        assertTrue(produto1.verificarEstoqueExcedente(101));
    }

    @Test
    void deveRetornarFalseEstoqueExcedente(){
        Produto produto1 = new Produto("Caneta", 100, 2, 10, 200);
        assertFalse(produto1.verificarEstoqueExcedente(95));
    }

    @Test
    void deveDebitarEstoque(){
        Produto produto1 = new Produto("Caneta", 100, 2, 10, 200);
        Cliente cliente1 = new Cliente("Marcos","123");
        produto1.vender("04/08/21",cliente1,2);
        assertEquals(98,produto1.getQtdeEstoque());
    }

    @Test
    void deveCreaditarEstoque(){
        Produto produto1 = new Produto("Caneta", 100, 2, 10, 200);
        Cliente cliente1 = new Cliente("Marcos","123");
        produto1.comprar("04/08/21", new Fornecedor("Tambasa", "1234"),2, 2.0F);
        assertEquals(102,produto1.getQtdeEstoque());
    }

    @Test
    void deveRetornarHistoricoVazio(){
        Produto produto = new Produto("Caneta", 100, 2, 10, 200);
        assertEquals(new ArrayList<String>(), produto.exibirHistorico());
    }

    @Test
    void deveRetornarCalculoValorVenda(){
        Produto produto1 = new Produto("Caneta",100, 2,10,20);
        assertEquals(60.0,produto1.calcularValorVenda(30));
    }



}