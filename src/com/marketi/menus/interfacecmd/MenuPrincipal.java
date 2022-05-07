package com.marketi.menus.interfacecmd;

import java.util.Arrays;

import com.marketi.armazenamento.Catalogo;
import com.marketi.entidades.Produto;

public class MenuPrincipal {
    
    UISelecaoCmd menu;
    Catalogo catalogo;

    public MenuPrincipal(Catalogo catalogo){
        this.catalogo = catalogo;
        this.menu = new UISelecaoCmd(
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
                cadastrarProduto();
                break;
            case 2:
                removerProduto();
                break;
            case 3:
                this.catalogo.imprimir();
                break;
            case 4:
                mudarPreco();
                break;
            case 5:
                System.out.println("Até logo!");
                System.exit(0);
                break;
            default:
                break;
        }
        this.executar();
    }

    public void cadastrarProduto(){
        MenuCadastrarProduto menuCadastro = new MenuCadastrarProduto(this.catalogo);
        menuCadastro.executar();
    }

    public void removerProduto(){
        String idDoProduto = this.menu.lerString("Digite o id do produto: ");
        this.catalogo.remover(idDoProduto);
    }

    public void mudarPreco(){
        String idDoProduto = this.menu.lerString("Digite o id do produto: ");
        Produto produtoSelecionado = this.catalogo.encontrarProduto(idDoProduto);
        String marca = produtoSelecionado.getMarca();
        String modelo = produtoSelecionado.getModelo();
        double precoAtual = produtoSelecionado.getPreco();
        System.out.printf("Marca: %s%n", marca);
        System.out.printf("Modelo: %s%n", modelo);
        System.out.printf("Preço Atual: %.2f%n", precoAtual);
        double novoPreco = this.menu.lerDouble("Digite o novo preço: ");
        produtoSelecionado.setPreco(novoPreco);
    }
}
