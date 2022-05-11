package com.marketi.auxiliares;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitor {
    private static Scanner scanner;

    public static int lerInt(String mensagem) {
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
        scanner = new Scanner(System.in);
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static double lerDouble(String mensagem) {
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
