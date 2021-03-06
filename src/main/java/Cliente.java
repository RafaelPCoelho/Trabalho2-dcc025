//RAFAEL FIALHO PINTO COELHO MATRICULA: 201965573C
//WELLINGTON PEREIRA SILVA MATRICULA: 201935041

public class Cliente extends Pessoa{

    public Cliente(String nome, String cpf) {

        super(nome);

        if(cpf == null){
            throw new IllegalArgumentException("Falta informar o cpf");
        }

        this.cpf = cpf;
    }

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
