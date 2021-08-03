public class Venda extends Transacao{

    private Cliente cliente;
    private Produto produto;

    public Venda(String dataVenda,Cliente cliente, Produto produto, int qtdeVendida) {//String dataVenda, String cliente, String produto, Integer qtdeVendida
        super(dataVenda, produto, qtdeVendida);
        this.cliente = cliente;
        this.produto = produto;
    }

    public boolean vender(String produto, Integer qtdeVendida){
       return true;
    }
}
