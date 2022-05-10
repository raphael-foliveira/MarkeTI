package com.marketi.ui.menuscmd;

import java.util.Arrays;
import com.marketi.armazenamento.Catalogo;
import com.marketi.ui.interfacecmd.UICmd;

public class MenuOrdenacao extends MenuOpcoes {
    // Pequeno menu responsável por permitir que usuário escolha em qual ordem os
    // produtos vão ser listados
    MenuOrdenacao(Catalogo catalogo) {
        super(catalogo);
        this.opcoes = new UICmd(
                "Como deseja ordenar os produtos?",
                Arrays.asList(
                        "1) Id",
                        "2) Preco"));
    }

    @Override
    public void executar() {
        System.out.println(linhaMenu);
        opcoes.mostrarOpcoes();
        int opcao = opcoes.lerSelecao();
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
