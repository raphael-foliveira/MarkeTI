package com.marketi.ui.interfacecmd;

import com.marketi.armazenamento.Catalogo;

public abstract class MenuOpcoes {

    Catalogo catalogo;

    public MenuOpcoes(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public abstract void executar();

}
