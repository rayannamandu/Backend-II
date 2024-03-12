package Exercicio7DTO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Cliente");
        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Informe o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();
        System.out.println("Informe o endereço do cliente: ");
        String enderecoCliente = scanner.nextLine();
        System.out.println("Informe a data de nascimento do cliente: ");
        String dataNascimentoCliente = scanner.nextLine();
        System.out.println("Informe o telefone do cliente: ");
        String telefoneCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente, enderecoCliente, dataNascimentoCliente, telefoneCliente);

        System.out.println("\nCadastro de Livro");
        System.out.println("Informe o nome do livro: ");
        String nomeLivro = scanner.nextLine();
        System.out.println("Informe o autor do livro: ");
        String autorLivro = scanner.nextLine();
        System.out.println("Informe a quantidade de páginas do livro: ");
        int qtdPaginasLivro = Integer.parseInt(scanner.nextLine());
        System.out.println("Informe a editora do livro: ");
        String editoraLivro = scanner.nextLine();

        Livro livro = new Livro(nomeLivro, autorLivro, qtdPaginasLivro, editoraLivro);

        System.out.println("\nEmpréstimo de Livro");
        System.out.println("Informe a data de empréstimo: ");
        String dataEmprestimo = scanner.nextLine();
        System.out.println("Informe a data de devolução: ");
        String dataDevolucao = scanner.nextLine();

        Emprestimo emprestimo = new Emprestimo(cliente, livro, dataEmprestimo, dataDevolucao);

        System.out.println("\nDetalhes do Empréstimo: ");
        System.out.println("Nome do Cliente: " + emprestimo.getNomeCliente());
        System.out.println("Nome do Livro: " + emprestimo.getNomeLivro());
        System.out.println("Data do Empréstimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Data da Devolução: " + emprestimo.getDataDevolucao());
    }
}