package com.marketi;

import com.marketi.armazenamento.Catalogo;
import com.marketi.menus.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        
        Catalogo catalogo = new Catalogo();

        catalogo.adicionarProdutos();

        MenuPrincipal menuprincipal = new MenuPrincipal(catalogo);

        menuprincipal.executar();
    }
}