import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarNomePessoa(){
        Pessoa pessoa = new Pessoa("Marco");
        assertEquals("Marco", pessoa.getNome());
    }

}