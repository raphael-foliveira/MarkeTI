package com.marketi;

import com.marketi.armazenamento.Catalogo;
import com.marketi.menus.menuscmd.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal(new Catalogo());
        menuPrincipal.executar();
}
}