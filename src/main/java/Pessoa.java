public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("nome nao pode ser null");
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
