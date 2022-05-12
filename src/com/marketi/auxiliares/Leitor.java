package com.marketi.auxiliares;

import java.util.Scanner;


public class Leitor {

    
    static Scanner scanner = new Scanner(System.in);

    public static int lerInt(String mensagem){

        scanner = new Scanner(System.in);
        System.out.println(mensagem);

        try {
            
            return scanner.nextInt();

        } catch (Exception e) {
            return lerInt(mensagem);
        }
    }

    public static Double lerDouble(String mensagem){

        scanner = new Scanner(System.in);

        System.out.println(mensagem);

        try {
            
            return scanner.nextDouble(); 

        } catch (Exception e) {
            return lerDouble(mensagem);
        }
    }

    public static String lerString(String mensagem){

        scanner = new Scanner(System.in);

        System.out.println(mensagem);

        try {
            
            return scanner.next();

        } catch (Exception e) {
            return lerString(mensagem);
        }
    }
}
