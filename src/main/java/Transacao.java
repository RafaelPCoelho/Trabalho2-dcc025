public class Transacao {

    private String dataTransacao;
    int qtde;
    private Produto produto;

    public Transacao(String dataTransacao,Produto produto, Integer qtde) {
        if(dataTransacao == null || produto == null || qtde == null ){
            throw new IllegalArgumentException("Algum parametro null");
        }

        this.dataTransacao = dataTransacao;
        this.qtde = qtde;
        this.produto = produto;
    }
}
