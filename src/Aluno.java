public class Aluno extends Pessoa{
    String matricula;

    public Aluno(String nome, String cpf, String data_nascimento, String matricula) {
        super(nome, cpf, data_nascimento);
        this.matricula = matricula;
    }
}
