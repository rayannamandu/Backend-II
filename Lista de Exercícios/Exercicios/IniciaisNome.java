package Exercicios;

import java.util.Scanner;

public class IniciaisNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String[] partesNome = nomeCompleto.split(" ");
        StringBuilder iniciais = new StringBuilder();

        for (String parte : partesNome) {
            if (!parte.isEmpty()) {
                iniciais.append(parte.charAt(0)).append(".");
            }
        }

        System.out.println("As iniciais do nome são: " + iniciais.toString().toUpperCase());
    }
}