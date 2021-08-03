import java.util.List;

public class Produto {

    private String nome;
    private Integer qtdeEstoque;
    private float precoUnit;
    private Integer estoqueMinimo;
    private Integer estoqueMaximo;
    private List<String> historico;

    public Produto(String nome, Integer qtdeEstoque, float precoUnit, Integer estoqueMinimo, Integer estoqueMaximo) {
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void registrarHistorico(String transacao) {
        this.historico.add(transacao);
    }

    public List<String> exibirHistorico(){
        return this.historico;
    }

    public void debitarEstoque(Integer quantidade){
        qtdeEstoque -= quantidade;
    }

    public void creditarEstoque(Integer quantidade){
        qtdeEstoque += quantidade;
    }

    public boolean verificarEstoqueBaixo(){
        if (estoqueMinimo > qtdeEstoque){
            return true;
        }

        return false;
    }

    public boolean verificarEstoqueInsuficiente(Integer quantidade){
        if(quantidade > qtdeEstoque ){
            return true;
        }

        return false;
    }

    public boolean verificarEstoqueExcedente(Integer quantidade){
        if(estoqueMaximo < (qtdeEstoque + quantidade)){
            return true;
        }

        return false;
    }

    public float calcularValorVenda(Integer quantidade){
        return quantidade * precoUnit;
    }

    public void vender(String dataVenda, Cliente cliente, Integer qtdeVendida){
        Venda venda = new Venda(dataVenda, cliente, this,qtdeVendida);

        if(venda.vender(this, qtdeVendida)){
            this.registrarHistorico("Venda do produto" + this.getNome());
        }
    }

    public void comprar(String dataCompra, Fornecedor fornecedor, Integer qtdeCompra, float precoUnit){
        Compra compra = new Compra(dataCompra, this,fornecedor,qtdeCompra, precoUnit);

        if(compra.comprar(this, qtdeCompra)){
            this.registrarHistorico("Compra do produto" + this.getNome());
        }
    }
}
