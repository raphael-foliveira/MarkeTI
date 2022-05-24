package com.marketi.auxiliares;

import com.marketi.armazenamento.Catalogo;
import com.marketi.menus.MenuPrincipal;

/**
 * Classe responsável pela execução do programa
 */
public class App {
    public static void run() {
        // criando catálogo
        Catalogo catalogo = new Catalogo();
        // preparando catálogo para demonstração
        catalogo.adicionarProdutosDemo();
        // criando o menu principal
        MenuPrincipal menuPrincipal = new MenuPrincipal(catalogo);
        // executando o menu principal
        menuPrincipal.executar();
    }
}
