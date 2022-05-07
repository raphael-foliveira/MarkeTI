package com.marketi.ui.interfacecmd;

import java.util.Arrays;

import com.marketi.armazenamento.Catalogo;
import com.marketi.entidades.Produto;

public class MenuPrincipal {

    UISelecaoCmd menu;
    Catalogo catalogo;

    public MenuPrincipal(Catalogo catalogo) {
        this.catalogo = catalogo;
        this.menu = new UISelecaoCmd(
                "Menu Principal",
                Arrays.asList(
                        "1) Cadastrar novo produto",
                        "2) Remover produto",
                        "3) Visualizar catálogo",
                        "4) Editar preço de produto",
                        "5) Sair"));
    }

    public Object executar() {

        menu.mostrarOpcoes();
        int opcao = menu.lerSelecao();
        switch (opcao) {
            case 1:
                cadastrarProduto();
                break;
            case 2:
                removerProduto();
                break;
            case 3:
                imprimirCatalogo();
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
        return executar();
    }

    public void cadastrarProduto() {
        // Cria e executa um menu de cadastro para interação com o usuário
        MenuCadastrarProduto menuCadastro = new MenuCadastrarProduto(this.catalogo);
        menuCadastro.executar();
    }

    public void removerProduto() {
        // recebe um id do usuário para remoção do produto do catálogo, caso exista
        String idDoProduto = menu.lerString("Digite o id do produto: ");
        boolean removido = catalogo.remover(idDoProduto);
        if (!removido) {
            System.out.println("Produto não encontrado");
        }
    }

    public void mudarPreco() {
        // recebe do usuário um id e um valor
        String idDoProduto = menu.lerString("Digite o id do produto: ");
        Produto produtoSelecionado = catalogo.encontrarProduto(idDoProduto);
        if (produtoSelecionado == null) {
            System.out.println("Produto não encontrado");
            return;
        }
        String marca = produtoSelecionado.getMarca();
        String modelo = produtoSelecionado.getModelo();
        double precoAtual = produtoSelecionado.getPreco();
        System.out.printf("Marca: %s%n", marca);
        System.out.printf("Modelo: %s%n", modelo);
        System.out.printf("Preço Atual: %.2f%n", precoAtual);
        double novoPreco = menu.lerDouble("Digite o novo preço: ");
        produtoSelecionado.setPreco(novoPreco);
    }

    public void imprimirCatalogo() {
        System.out.println(catalogo);
    }

}
