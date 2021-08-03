public class Compra extends Transacao{

    private Integer precoUnit;
    private Fornecedor fornecedor;
    private Produto produto;

    public Compra(String dataCompra, Produto produto,Fornecedor fornecedor, int qtdeCompra, Integer precoUnit) {
        super(dataCompra, produto, qtdeCompra);
        this.precoUnit = precoUnit;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public boolean comprar(String produto, Integer qtdeCompra){

        return true;
    }
}
