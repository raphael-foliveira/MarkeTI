package com.marketi.menus.interfacecmd;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UICmd {
    
    public String lerString(String mensagem){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensagem);
        String resposta = scanner.nextLine();
        return resposta;
    }

    public int lerInt(String mensagem){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensagem);
        try{
            int resposta = scanner.nextInt();
            return resposta;
        } catch (InputMismatchException e) {
            System.out.println("Esse valor deve ser um número inteiro");
            return lerInt(mensagem);
        }
    }

    public double lerDouble(String mensagem){
        Scanner scanner = new Scanner(System.in); 
        System.out.println(mensagem);
        try{
            double resposta = scanner.nextDouble();
            return resposta;
        } catch (InputMismatchException e) {
            System.out.println("Esse valor deve ser um número");
            return lerDouble(mensagem);
        }
    }

}
