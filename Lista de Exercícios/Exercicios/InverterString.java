package Exercicios;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algo: ");
        String texto = scanner.nextLine();

        StringBuilder textoInvertido = new StringBuilder(texto).reverse();

        System.out.println("Texto invertido: " + textoInvertido);
    }
}
