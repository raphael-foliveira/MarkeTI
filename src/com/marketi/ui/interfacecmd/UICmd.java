package com.marketi.ui.interfacecmd;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class UICmd {

    Scanner scanner;

    public UICmd() {
        this.scanner = new Scanner(System.in);
    }

    public String lerString(String mensagem) {
        // imprime uma mensagem e lê uma string do usuário
        scanner = new Scanner(System.in);
        System.out.print(mensagem);
        String resposta = scanner.nextLine();
        return resposta;
    }

    public int lerInt(String mensagem) {
        // imprime uma mensagem e lê um int do usuário
        scanner = new Scanner(System.in);
        System.out.print(mensagem);
        try {
            int resposta = scanner.nextInt();
            return resposta;
        } catch (InputMismatchException e) {
            System.out.println("Esse valor deve ser um número inteiro");
            return lerInt(mensagem);
        }
    }

    public double lerDouble(String mensagem) {
        // imprime uma mensagem e lê um double do usuário
        scanner = new Scanner(System.in);
        System.out.println(mensagem);
        try {
            double resposta = scanner.nextDouble();
            return resposta;
        } catch (InputMismatchException e) {
            System.out.println("Esse valor deve ser um número");
            return lerDouble(mensagem);
        }
    }
}
