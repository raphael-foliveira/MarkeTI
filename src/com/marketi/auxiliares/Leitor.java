package com.marketi.auxiliares;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitor {
    // Classe responsável pela leitura de dados fornecidos pelo usuário através do
    // terminal
    private static Scanner scanner;

    public static int lerInt(String mensagem) {
        // Imprime uma mensagem e lê um inteiro
        scanner = new Scanner(System.in);
        System.out.print(mensagem);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Esse valor deve ser um número inteiro. Tente novamente.");
            return lerInt(mensagem);
        }
    }

    public static String lerString(String mensagem) {
        // Imprime uma mensagem e lê uma String
        scanner = new Scanner(System.in);
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static double lerDouble(String mensagem) {
        // Imprime uma mensagem e lê um double
        scanner = new Scanner(System.in);
        System.out.print(mensagem);
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Esse valor deve ser um número. Tente novamente.");
            return lerDouble(mensagem);
        }
    }
}
