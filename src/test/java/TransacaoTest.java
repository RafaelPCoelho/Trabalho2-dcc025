import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    @Test
    void deveRetornarExcecaoData(){
        try{
            Produto produto1 = new Produto("Caneta", 100, 1.2F, 100, 200);
            Transacao transacao = new Transacao(null, produto1, 200);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Algum parametro null", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoProduto(){
        try{
            Transacao transacao = new Transacao("04/08/21",null,200000);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Algum parametro null", e.getMessage());
        }
    }

    @Test
    void deveRetornarExecaoQtde(){
        try{
            Produto produto1 = new Produto("Caneta", 100, 1.2F, 100, 200);
            Transacao transacao = new Transacao("04/08/21",produto1,null);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Algum parametro null", e.getMessage());
        }
    }
}