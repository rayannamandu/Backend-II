import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(1001);
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar entre 0 e 1000 o número sorteado.");

        do {
            System.out.println("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas ++;

            if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número sorteado é menor.");
            }
        } while (palpite != numeroSorteado);

        System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");
    }
}