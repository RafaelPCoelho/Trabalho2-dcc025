import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

        @Test
        void deveRetornaNomeProduto(){
            Produto produto1 = new Produto("Caneta", 100, 1.2F, 10, 200);
            assertEquals("Caneta",produto1.getNome());
        }

        @Test
        void
}