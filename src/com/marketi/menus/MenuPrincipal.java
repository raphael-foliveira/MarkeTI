package com.marketi.menus;

import java.util.ArrayList;

import com.marketi.auxiliares.FormatadorCatalogo;
import com.marketi.auxiliares.Leitor;
import com.marketi.entidades.Produto;
import com.marketi.armazenamento.Catalogo;

public class MenuPrincipal extends Menus {

    public MenuPrincipal(Catalogo catalogo) {
        super(catalogo);
        opcoes = new ArrayList<>();
        opcoes.add("1) Cadastrar novo produto");
        opcoes.add("2) Buscar produto por Id");
        opcoes.add("3) Remover Produto");
        opcoes.add("4) Listar todos os produtos");
        opcoes.add("5) Mudar preço de um produto");
        opcoes.add("6) Sair");
    }

    public void executar() {
        printLinha();
        System.out.println("Menu principal");
        mostrarOpcoes();
        int opcao = Leitor.lerInt(">>> ");
        switch (opcao) {
            case 1:
                MenuCadastrar menuCadastrar = new MenuCadastrar(catalogo);
                menuCadastrar.executar();
                break;
            case 2:
                Produto produto = buscarProdutoPorId();
                System.out.println(produto);
                break;
            case 3:
                removerProduto();
                break;
            case 4:
                listarTodosOsProdutos();
                break;
            case 5:
                mudarPrecoDeProduto();
                break;
            case 6:
                System.out.println("Volte sempre");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        executar();
    }

    public Produto buscarProdutoPorId() {
        String idDoProduto = Leitor.lerString("Digite o id do produto: ");
        Produto produto = catalogo.encontrarProduto(idDoProduto);
        if (produto != null) {
            return produto;
        }
        System.out.println("Produto não encontrado.");
        return buscarProdutoPorId();
    }

    public void removerProduto() {
        Produto produto = buscarProdutoPorId();
        System.out.printf("Tem certeza que deseja apagar %s %s?%n", produto.getMarca(), produto.getModelo());
        String resposta = Leitor.lerString("(s/n): ");
        if (resposta.equals("s")) {
            catalogo.remover(produto);
            System.out.printf("%s removido.%n", produto.getModelo());
        } else {
            System.out.println("Ação cancelada.");
        }
    }

    public void mudarPrecoDeProduto() {
        Produto produto = buscarProdutoPorId();
        System.out.printf("Marca: %s%n", produto.getMarca());
        System.out.printf("Modelo: %s%n", produto.getModelo());
        System.out.printf("Preço atual: %.2f%n", produto.getPreco());
        double novoPreco = Leitor.lerDouble("Digite o novo preço do produto: ");
        produto.setPreco(novoPreco);
        System.out.printf("Preço de %s atualizado para %.2f%n", produto.getModelo(), produto.getPreco());
    }

    public void listarTodosOsProdutos() {
        MenuOrdenacao menuOrdenacao = new MenuOrdenacao(catalogo);
        menuOrdenacao.executar();
        String listaProdutos = FormatadorCatalogo.formatarCatalogo(catalogo);
        System.out.println(listaProdutos);
    }
}
