public class Funcionario extends Pessoa {

    double salario;
    String data_admissao;
    String cargo;
    public Funcionario(String nome, String cpf, String data_nascimento, double salario, String data_admissao, String cargo) {
        super(nome, cpf, data_nascimento);
        this.salario = salario;
        this.data_admissao = data_admissao;
        this.cargo = cargo;
    }
}
