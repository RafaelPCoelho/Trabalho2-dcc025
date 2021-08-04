public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Falta informar o nome");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
