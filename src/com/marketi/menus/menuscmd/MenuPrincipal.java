package com.marketi.menus.menuscmd;

import java.util.ArrayList;

import com.marketi.armazenamento.Catalogo;

public class MenuPrincipal extends MenuCmd {
    
    public MenuPrincipal(Catalogo catalogo){
        super(catalogo);
        this.titulo = "Menu principal";
        this.opcoes = new ArrayList<>();
        this.opcoes.add("1) Ver Produtos");
        this.opcoes.add("2) Cadastrar Produto");
        this.opcoes.add("3) Remover produto");
        this.opcoes.add("4) Modificar preço de um produto");
        this.opcoes.add("5) Sair");
    }

    public void executar(){
        int opcao = pegarSelecaoUsuario();
        switch (opcao) {
            case 1:
                catalogo.imprimir();
                break;
            case 2:
                MenuCadastro menuCadastro = new MenuCadastro(catalogo);
                menuCadastro.executar();
                break;
            case 3:
                String idDoProdutoASerRemovido = lerString("Digite o id do produto: ");
                
                catalogo.remover(idDoProdutoASerRemovido);
                break;
            case 4:

                break;
            case 5:
                System.out.println("Até logo!");
                System.exit(0);
            default:
                break;
        }
        executar();
    }

}
