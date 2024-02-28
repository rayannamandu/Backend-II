public class Professor extends Pessoa{

    double salario;
    String disciplina;
    public Professor(String nome, String cpf, String data_nascimento, double salario, String disciplina) {
        super(nome, cpf, data_nascimento);
        this.salario = salario;
        this.disciplina = disciplina;
    }
}
