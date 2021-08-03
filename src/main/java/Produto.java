import java.util.List;

public class Produto {

    private String nome;
    private Integer qtdeEstoque;
    private float precoUnit;
    private Integer estoqueMinimo;
    private Integer estoqueMaximo;
    private List<Produto> historico;

    public Produto(String nome, Integer qtdeEstoque, float precoUnit, Integer estoqueMinimo, Integer estoqueMaximo) {
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public void registrarHistorico(Transacao transacao) {

    }

    public void exibirHistorico(){

    }

    public void debitarEstoque(Integer quantidade){
        qtdeEstoque -= quantidade;
    }

    public void creditarEstoque(Integer quantidade){
        qtdeEstoque += quantidade;
    }

    public void verificarEstoqueBaixo(){

    }

    public void verificarEstoqueInsuficiente(Integer quantidade){

    }

    public void verificarEstoqueExcedente(Integer quantidade){

    }

    public void calcularValorVenda(Integer quantidade){

    }

    public void vender(String dataVenda, Cliente cliente, Integer qtdeVendida){

    }

    public void comprar(String dataCompra, Fornecedor fornecedor, Integer qtdeCompra, float precoUnit){

    }
}
