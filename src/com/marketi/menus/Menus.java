package com.marketi.menus;

import java.util.List;

import com.marketi.armazenamento.Catalogo;

public abstract class Menus {
    // classe abstrata que define o formato das classes de menus

    Catalogo catalogo;
    List<String> opcoes;

    Menus(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public abstract void executar(); // impõe que as classes filhas definam sua execução

    public void mostrarOpcoes() {
        // imprime para o usuário todas as opções do menu
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    public void printLinha() {
        // imprime uma linha no menu para organização visual
        System.out.println("---------------------------------------");
    }

}
