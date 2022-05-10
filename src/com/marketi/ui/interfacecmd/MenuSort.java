package com.marketi.ui.interfacecmd;

import java.util.Arrays;
import com.marketi.armazenamento.Catalogo;

public class MenuSort extends MenuOpcoes {

    UICmd menu;

    MenuSort(Catalogo catalogo) {
        super(catalogo);
        this.menu = new UICmd(
                "Como deseja ordenar os produtos?",
                Arrays.asList(
                        "1) Id",
                        "2) Preco"));
    }

    @Override
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
