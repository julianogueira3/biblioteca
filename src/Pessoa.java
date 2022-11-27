public class Pessoa {
    int id;
    int cpf;
    String nome;
    String telefone;

    public Pessoa(int id, int cpf, String nome, String telefone) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa " +
                "id=" + id +
                ", cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone ;
    }
}
