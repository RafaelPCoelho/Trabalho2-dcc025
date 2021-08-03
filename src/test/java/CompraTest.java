import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveRetornarExcecaoFornecedorNulo(){
        try{
            Produto produto1 = new Produto("Caneta", 100, 1.2F, 100, 200);
            Compra compra = new Compra("01/08/2021", produto1, null, 200,1.2F);

            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Algum parametro null", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoPrecoUnitarioNulo(){
        try{
            Produto produto1 = new Produto("Caneta", 100, 1.2F, 100, 200);
            Fornecedor fornecedor = new Fornecedor("Tambasa", "1234.");
            Compra compra = new Compra("01/08/2021", produto1, fornecedor, 200,null);

            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Algum parametro null", e.getMessage());
        }
    }
}