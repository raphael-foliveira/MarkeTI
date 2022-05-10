package com.marketi.ui.interfacecmd;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UICmd implements Legivel {

    private String titulo;
    private List<String> opcoes;

    public UICmd(String titulo, List<String> opcoes) {
        super();
        this.titulo = titulo;
        this.opcoes = opcoes;
    }

    public void mostrarOpcoes() {
        // Método responsável pela impressão do menu no terminal
        System.out.println(this.titulo);
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    public int lerSelecao() {
        // Método responsável pela leitura da entrada do usuário (escolha da opção)
        try {
            // tentando ler um número
            int selecao = lerInt(">>> ");
            if (selecao <= opcoes.size() && 0 < selecao) {
                // se o valor for válido (correspondente ao número de opções do menu), retorna o
                // valor
                return selecao;
            } else {
                // caso não exista opção no menu para o valor selecionado, retorna a própria
                // função
                System.out.println("Comando inválido, tente novamente");
                return lerSelecao();
            }
        } catch (InputMismatchException e) {
            // Caso um não-número seja fornecido como entrada,
            // tratamos o erro e invocamos o método novamente
            System.out.println("Comando inválido, tente novamente");
            return lerSelecao();
        }
    }

    @Override
    public String lerString(String mensagem) {
        // imprime uma mensagem e lê uma string do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensagem);
        String resposta = scanner.nextLine();
        return resposta;
    }

    @Override
    public int lerInt(String mensagem) {
        // imprime uma mensagem e lê um int do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensagem);
        try {
            int resposta = scanner.nextInt();
            return resposta;
        } catch (InputMismatchException e) {
            System.out.println("Esse valor deve ser um número inteiro");
            return lerInt(mensagem);
        }
    }

    @Override
    public double lerDouble(String mensagem) {
        // imprime uma mensagem e lê um double do usuário
        Scanner scanner = new Scanner(System.in);
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
