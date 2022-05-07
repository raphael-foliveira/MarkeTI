package com.marketi.menus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.marketi.armazenamento.Catalogo;

public abstract class MenuCmd{
    // Classe abstrata responsável por parte da implementação do menu do terminal
    protected String titulo;
    protected ArrayList<String> opcoes;
    protected Catalogo catalogo;

    public MenuCmd(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    
    public int pegarSelecaoUsuario(){
        // Método utilizado para imprimir o menu e pegar a seleção do usuário
        // (invoca os dois métodos abaixo)

        mostrarMenu();
        int selecao = lerSelecao();
        return selecao;
        
    }

    public void mostrarMenu(){
        // Método responsável pela impressão do menu no terminal

        System.out.println(this.titulo);
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    public int lerSelecao(){
        // Método responsável pela leitura da entrada do usuário (opção escolhida)

        try ( // Try implementado apenas para resolver o "resource leak" do Scanner
            Scanner scanner = new Scanner(System.in)) {
            System.out.print(">>> ");
            try{
                // tentando ler um número
                int selecao = scanner.nextInt();
                if (selecao < opcoes.size() && 0 < selecao) {
                    // se o valor for válido (entre 1 e 4), retorna o valor
                    return selecao;
                } else {
                    // caso não exista opção no menu para o valor selecionado, retorna a própria função
                    System.out.println("Valor inválido");
                    System.out.println("Tente novamente");
                    return lerSelecao();
                }
            } catch (InputMismatchException e){
                // Caso um não-número seja fornecido como entrada, 
                // tratamos o erro e invocamos o método novamente

                System.out.println("Comando inválido, tente novamente");
                mostrarMenu();
                return lerSelecao();
            }
        }
    }

    public String lerString(String mensagem){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(mensagem);
            String resposta = scanner.nextLine();
            return resposta;
        }
    }

    public int lerInt(String mensagem){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(mensagem);
            try{
                int resposta = scanner.nextInt();
                return resposta;
            } catch (InputMismatchException e) {
                System.out.println("Esse valor deve ser um número inteiro");
                return lerInt(mensagem);
            }
        }
    }

    public double lerDouble(String mensagem){
        try (Scanner scanner = new Scanner(System.in)) {
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
}
