package com.marketi.ui.interfacecmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.marketi.armazenamento.Catalogo;
import com.marketi.entidades.Produto;

import java.lang.Comparable;

public class MenuSort {

    Catalogo catalogo;
    UICmd menu;

    MenuSort(Catalogo catalogo) {
        this.catalogo = catalogo;
        this.menu = new UICmd(
                "Como deseja ordenar os produtos?",
                Arrays.asList(
                        "1) Id",
                        "2) Preco"));
    }

    public void executar() {
        menu.mostrarOpcoes();
        int opcao = menu.lerSelecao();
        switch (opcao) {
            case 1:
                catalogo.ordenarPorId();
                break;
            case 2:
                catalogo.ordenarPorPreco();
                break;
            default:
                break;
        }

    }

}
