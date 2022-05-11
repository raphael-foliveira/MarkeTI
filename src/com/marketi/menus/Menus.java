package com.marketi.menus;

import java.util.List;

import com.marketi.armazenamento.Catalogo;

public abstract class Menus {

    Catalogo catalogo;
    List<String> opcoes;

    Menus(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public abstract void executar();

    public void mostrarOpcoes() {
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    public void printLinha() {
        System.out.println("---------------------------------------");
    }

}
