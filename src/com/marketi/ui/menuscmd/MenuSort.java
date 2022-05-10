package com.marketi.ui.menuscmd;

import java.util.Arrays;
import com.marketi.armazenamento.Catalogo;
import com.marketi.ui.interfacecmd.UICmd;

public class MenuSort extends MenuOpcoes {

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
        System.out.println(linhaMenu);
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
