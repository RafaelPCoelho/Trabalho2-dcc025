//RAFAEL FIALHO PINTO COELHO MATRICULA: 201965573C
//WELLINGTON PEREIRA SILVA MATRICULA: 201935041

public class Transacao {

    private String dataTransacao;
    int qtde;
    private Produto produto;

    public Transacao(String dataTransacao,Produto produto, Integer qtde) {
        if(dataTransacao == null || produto == null || qtde == null ){
            throw new IllegalArgumentException("Falta parametro na transacao");
        }

        this.dataTransacao = dataTransacao;
        this.qtde = qtde;
        this.produto = produto;
    }
}
