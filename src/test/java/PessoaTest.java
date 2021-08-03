import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarNomePessoa(){
        Pessoa pessoa = new Pessoa("Marco");
        assertEquals("Marco", pessoa.getNome());
    }
    @Test
    void deveRetornarExcecaoNome() {
        try{
            Pessoa pessoa = new Pessoa(null);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("nome nao pode ser null",e.getMessage());
        }
    }

}