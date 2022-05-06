package com.marketi.menus.menuscmd;

import com.marketi.menus.MenuCmd;

public class MenuPrincipal extends MenuCmd {
    
    public MenuPrincipal(){
        super();
        this.nome = "Menu principal";
        this.opcoes = String.format("1) Opcao1%n2) Opcao2%n3) Opcao3");
    }
}
