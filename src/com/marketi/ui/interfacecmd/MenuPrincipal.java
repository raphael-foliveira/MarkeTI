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
                        "2) Buscar produto por id",
                        "3) Remover produto",
                        "4) Visualizar catálogo",
                        "5) Editar preço de produto",
                        "6) Sair"));
    }

    public Object executar() {
        // Executa o menu e executa o método referente à opção escolhida pelo usuário
        menu.mostrarOpcoes();
        int opcao = menu.lerSelecao();
        switch (opcao) {
            case 1:
                cadastrarProduto();
                break;
            case 2:
                buscarProdutoId();
                break;
            case 3:
                removerProduto();
                break;
            case 4:
                imprimirCatalogo();
                break;
            case 5:
                mudarPreco();
                break;
            case 6:
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

    public void buscarProdutoId() {
        // busca um produto do catálogo pelo seu id, caso exista
        String idDoProduto = menu.lerString("Digite o id do produto: ");
        Produto produto = catalogo.encontrarProduto(idDoProduto);
        if (produto == null) {
            System.out.println("Produto não encontrado");
            return;
        }
        System.out.println("----------------------------------------");
        System.out.println(produto);
        System.out.println("----------------------------------------");

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
        // recebe do usuário um id para buscar um produto
        String idDoProduto = menu.lerString("Digite o id do produto: ");
        Produto produtoSelecionado = catalogo.encontrarProduto(idDoProduto);
        if (produtoSelecionado == null) {
            // Checa se o produto selecionado pelo usuário existe. Caso não exista, a
            // execução da função é interrompida
            System.out.println("Produto não encontrado");
            return;
        }
        // Imprime informações básicas do produto e seu preço
        System.out.printf("Marca: %s%n", produtoSelecionado.getMarca());
        System.out.printf("Modelo: %s%n", produtoSelecionado.getModelo());
        System.out.printf("Preço Atual: %.2f%n", produtoSelecionado.getPreco());
        double novoPreco = menu.lerDouble("Digite o novo preço: ");
        produtoSelecionado.setPreco(novoPreco);
    }

    public void imprimirCatalogo() {
        // Imprime todo o catálogo
        System.out.println(catalogo);
    }

}
