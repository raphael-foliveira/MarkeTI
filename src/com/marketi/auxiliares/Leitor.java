package com.marketi.auxiliares;

import java.util.Scanner;


public class Leitor {

    
    static Scanner scanner = new Scanner(System.in);

    public static int LerInt(String mensagem){

        scanner = new Scanner(System.in);
        System.out.println(mensagem);

        try {
            
            return scanner.nextInt();

        } catch (Exception e) {
            return LerInt(mensagem);
        }
    }

    public static Double LerDouble(String mensagem){

        scanner = new Scanner(System.in);

        System.out.println(mensagem);

        try {
            
            return scanner.nextDouble(); 

        } catch (Exception e) {
            return LerDouble(mensagem);
        }
    }

    public static String LerString(String mensagem){

        scanner = new Scanner(System.in);

        System.out.println(mensagem);

        try {
            
            return scanner.next();

        } catch (Exception e) {
            return LerString(mensagem);
        }
    }
}
