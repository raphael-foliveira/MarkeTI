package com.marketi.menus.interfacecmd;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class InterfaceMenuCmd extends InterfaceCmd{

    private String titulo;
    private List<String> opcoes;

    public InterfaceMenuCmd(String titulo, List<String> opcoes) {
        this.titulo = titulo;
        this.opcoes = opcoes;
    }

    public void mostrarOpcoes(){
        // Método responsável pela impressão do menu no terminal
        System.out.println(this.titulo);
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    public int lerSelecao(){
        // Método responsável pela leitura da entrada do usuário (escolha da opção)

        Scanner scanner = new Scanner(System.in);
        System.out.print(">>> ");
        try{
            // tentando ler um número
            int selecao = scanner.nextInt();
            if (selecao < opcoes.size() && 0 < selecao) {
                // se o valor for válido (entre 1 e 4), retorna o valor
                return selecao;
            } else {
                // caso não exista opção no menu para o valor selecionado, retorna a própria função
                System.out.println("Comando inválido, tente novamente");
                return lerSelecao();
            }
        } catch (InputMismatchException e){
            // Caso um não-número seja fornecido como entrada, 
            // tratamos o erro e invocamos o método novamente
         System.out.println("Comando inválido, tente novamente");
            mostrarOpcoes();
            return lerSelecao();
        } finally {
            scanner.close();
        }
    }
}
