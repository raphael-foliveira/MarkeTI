package com.marketi.menus;

import java.util.ArrayList;

import com.marketi.armazenamento.Catalogo;
import com.marketi.auxiliares.Leitor;

public class MenuOrdenacao extends Menus {

    MenuOrdenacao(Catalogo catalogo) {
        super(catalogo);
        opcoes = new ArrayList<>();
        opcoes.add("1) Id");
        opcoes.add("2) Preço");
        opcoes.add("3) Modelo");
        opcoes.add("4) Voltar ao menu principal");
    }

    @Override
    public void executar() {
        // Executa o menu mostrando as opções de ordenação
        printLinha();
        System.out.println("Como deseja ordenar os dados?");
        mostrarOpcoes();
        int opcao = Leitor.lerInt(">>> ");
        switch (opcao) {
            case 1:
                catalogo.ordenarPorId();
                break;
            case 2:
                catalogo.ordenarPorPreco();
                break;
            case 3:
                catalogo.ordenarPorModelo();
                break;
            case 4:
                MenuPrincipal menuPrincipal = new MenuPrincipal(catalogo);
                menuPrincipal.executar();
                break;

            default:
                break;
        }
    }
}
