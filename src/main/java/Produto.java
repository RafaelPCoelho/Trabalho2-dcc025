import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private Integer qtdeEstoque;
    private Integer precoUnit;
    private Integer estoqueMinimo;
    private Integer estoqueMaximo;
    private List<String> historico;

    public Produto(String nome, Integer qtdeEstoque, Integer precoUnit, Integer estoqueMinimo, Integer estoqueMaximo) {

        if(nome == null || qtdeEstoque == null || precoUnit == null || estoqueMinimo == null || estoqueMaximo == null){
            throw new IllegalArgumentException("Falta parametro no produto");
        }

        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.historico = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(Integer qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
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
            this.registrarHistorico("Venda do produto" + " " + this.getNome());
        }
    }

    public void comprar(String dataCompra, Fornecedor fornecedor, Integer qtdeCompra, Float precoUnit){
        Compra compra = new Compra(dataCompra, this,fornecedor,qtdeCompra, precoUnit);

        if(compra.comprar(this, qtdeCompra)){
            this.registrarHistorico("Compra do produto" + " " + this.getNome());
        }
    }
}
