public class Venda extends Transacao{

    private Cliente cliente;
    private Produto produto;

    public Venda(String dataVenda,Cliente cliente, Produto produto, int qtdeVendida) {//String dataVenda, String cliente, String produto, Integer qtdeVendida
        super(dataVenda, produto, qtdeVendida);
        this.cliente = cliente;
        this.produto = produto;
    }

    public boolean vender(Produto produto, Integer qtdeVendida){
        if(produto.verificarEstoqueInsuficiente(qtdeVendida)){
            produto.registrarHistorico("Produto Insuficiente" + produto.getNome());
            return false;
        }
        produto.debitarEstoque(qtdeVendida);

        produto.registrarHistorico("Valor da venda = " + produto.calcularValorVenda(qtdeVendida) );

        if(produto.verificarEstoqueBaixo()){
            produto.registrarHistorico("Estoque Baixo" + produto.getNome());
        }
        return true;
    }
}
