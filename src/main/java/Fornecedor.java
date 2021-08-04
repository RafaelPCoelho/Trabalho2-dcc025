//RAFAEL FIALHO PINTO COELHO MATRICULA: 201965573C
//WELLINGTON PEREIRA SILVA MATRICULA: 201935041

public class Fornecedor extends Pessoa{
    private String cnpj;

    public Fornecedor(String nome, String cnpj) {
        super(nome);

        if(cnpj == null){
            throw new IllegalArgumentException("Falta informar o cnpj");
        }

        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
