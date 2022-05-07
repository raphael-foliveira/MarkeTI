package com.marketi;

import com.marketi.armazenamento.Catalogo;
import com.marketi.ui.interfacecmd.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        // criando catálogo
        Catalogo catalogo = new Catalogo();
        // criando o menu principal
        MenuPrincipal menuPrincipal = new MenuPrincipal(catalogo);
        // executando o menu principal
        menuPrincipal.executar();
    }
}