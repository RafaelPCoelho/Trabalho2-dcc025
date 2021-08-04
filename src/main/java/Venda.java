//RAFAEL FIALHO PINTO COELHO MATRICULA: 201965573C
//WELLINGTON PEREIRA SILVA MATRICULA: 201935041

public class Venda extends Transacao{

    private Cliente cliente;

    public Venda(String dataVenda,Cliente cliente, Produto produto, int qtdeVendida) {
        super(dataVenda, produto, qtdeVendida);
        if(cliente == null) {
            throw new IllegalArgumentException("Falta informar o cliente");
        }
        this.cliente = cliente;
    }

    public boolean vender(Produto produto, Integer qtdeVendida){
        if(produto.verificarEstoqueInsuficiente(qtdeVendida)){
            produto.registrarHistorico("Produto Insuficiente" + produto.getNome());
            return false;
        }
        produto.debitarEstoque(qtdeVendida);

        produto.registrarHistorico("Valor da venda = " + produto.calcularValorVenda(qtdeVendida));

        if(produto.verificarEstoqueBaixo()){
            produto.registrarHistorico("Estoque Baixo" + produto.getNome());
        }
        return true;
    }
}
