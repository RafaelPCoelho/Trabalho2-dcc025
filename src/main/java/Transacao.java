public class Transacao {

    private String dataTransacao;
    int qtde;
    private Produto produto;

    public Transacao(String dataTransacao,Produto produto, int qtde) {
        this.dataTransacao = dataTransacao;
        this.qtde = qtde;
        this.produto = produto;
    }
}
