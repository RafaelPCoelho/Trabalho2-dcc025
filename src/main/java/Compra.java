public class Compra extends Transacao{

    private Float precoUnit;
    private Fornecedor fornecedor;

    public Compra(String dataCompra, Produto produto,Fornecedor fornecedor, int qtdeCompra, Float precoUnit) {

        super(dataCompra, produto, qtdeCompra);

        if(fornecedor == null || precoUnit == null){
            throw new IllegalArgumentException("Falta parametro na compra");
        }

        this.precoUnit = precoUnit;
        this.fornecedor = fornecedor;
    }

    public boolean comprar(Produto produto, Integer qtdeCompra){
        if(produto.verificarEstoqueExcedente(qtdeCompra)){
            produto.registrarHistorico("Estoque excedente" + produto.getNome());
            return false;
        }
        produto.creditarEstoque(qtdeCompra);
        return true;
    }
}
