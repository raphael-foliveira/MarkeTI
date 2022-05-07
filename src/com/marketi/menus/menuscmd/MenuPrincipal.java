package com.marketi.menus.menuscmd;

import java.util.ArrayList;
import java.util.Arrays;

import com.marketi.menus.MenuCmd;

public class MenuPrincipal extends MenuCmd {
    
    public MenuPrincipal(){
        super();
        this.nome = "Menu principal";
        this.opcoes = new ArrayList<>();
        this.opcoes.add("1) Ver Produtos");
        this.opcoes.add("2) Cadastrar Produto");
        this.opcoes.add("3) Remover produto");
        this.opcoes.add("4) Sair");
    }

}
