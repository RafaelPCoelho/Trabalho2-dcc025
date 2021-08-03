public class Compra extends Transacao{

    private float precoUnit;
    private Fornecedor fornecedor;
    private Produto produto;

    public Compra(String dataCompra, Produto produto,Fornecedor fornecedor, int qtdeCompra, float precoUnit) {
        super(dataCompra, produto, qtdeCompra);
        this.precoUnit = precoUnit;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public boolean comprar(Produto produto, Integer qtdeCompra){
        return true;
    }
}
