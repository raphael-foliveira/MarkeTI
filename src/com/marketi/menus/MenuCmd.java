package com.marketi.menus;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class MenuCmd implements Menu{
    // Classe abstrata responsável por parte da implementação do menu do terminal
    protected String nome;
    protected String opcoes;
    
    public int pegarSelecaoUsuario(){
        // Método utilizado para imprimir o menu e pegar a seleção do usuário
        // (invoca os dois métodos abaixo)

        mostrarMenu();
        int selecao = lerSelecao();
        return selecao;
        
    }

    @Override
    public void mostrarMenu(){
        // Método responsável pela impressão do menu no terminal

        System.out.println(this.nome);
        System.out.println(this.opcoes);
    }

    @Override
    public int lerSelecao(){
        // Método responsável pela leitura da entrada do usuário (opção escolhida)

        try ( // Try implementado apenas para resolver o "resource leak" do Scanner
            Scanner scanner = new Scanner(System.in)) {
            System.out.print(">>> ");
            try{
                // tentando ler um número
                int selecao = scanner.nextInt();
                return selecao;
            } catch (InputMismatchException e){
                // Caso um não-número seja fornecido como entrada, 
                // tratamos o erro e invocamos o método novamente

                System.out.println("Comando inválido, tente novamente");
                System.out.println(this.opcoes);
                return lerSelecao();
            }
        }
    }




}
