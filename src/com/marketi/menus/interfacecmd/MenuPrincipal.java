package com.marketi.menus.interfacecmd;

import java.util.Arrays;

import com.marketi.armazenamento.Catalogo;

public class MenuPrincipal {
    
    InterfaceMenuCmd menu;
    Catalogo catalogo;

    public MenuPrincipal(Catalogo catalogo){
        this.menu = new InterfaceMenuCmd(
            "Menu Principal", 
            Arrays.asList(
                "1) Cadastrar novo produto",
                "2) Remover produto",
                "3) Visualizar catálogo",
                "4) Editar preço de produto",
                "5) Sair"
                )
            );
    }

    public void executar(){
        this.menu.mostrarOpcoes();
        int opcao = this.menu.lerSelecao();
        switch (opcao) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
        
            default:
                break;
        }
    }

    public void cadastrarProduto(){
        
    }
}
