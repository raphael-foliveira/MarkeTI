package com.marketi.menus.menuscmd;

import java.util.ArrayList;

import com.marketi.menus.MenuCmd;

public class MenuCadastro extends MenuCmd {
    
    MenuCadastro(){
        super();
        this.nome = "Cadastrar novo produto";
        this.opcoes = new ArrayList<>();
    }
}
