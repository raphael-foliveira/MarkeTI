package com.marketi;

import com.marketi.armazenamento.Catalogo;
import com.marketi.ui.interfacecmd.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        MenuPrincipal menuPrincipal = new MenuPrincipal(catalogo);

        menuPrincipal.executar();
    }
}