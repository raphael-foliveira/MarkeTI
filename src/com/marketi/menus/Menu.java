package com.marketi.menus;

import com.marketi.armazenamento.*;

import java.util.List;


public abstract class Menu {

    protected Catalogo catalogo;

    protected List<String> opcoes;

    Menu(Catalogo catalogo){

        this.catalogo = catalogo;
    }

    public abstract void executar();

    public void MostrarOpcoes(){
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    public void Linha(){
        System.out.println("---------------------------------");
    }
}
