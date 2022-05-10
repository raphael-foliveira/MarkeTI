package com.marketi.ui.menuscmd;

import com.marketi.armazenamento.Catalogo;
import com.marketi.ui.interfacecmd.UICmd;

public abstract class MenuOpcoes {
    // classe abstrata que define os atributos e método que cada classe de menu deve
    // ter e implementar
    Catalogo catalogo;
    UICmd opcoes;
    String linhaMenu = "----------------------------------------";

    public MenuOpcoes(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public abstract void executar();

}
