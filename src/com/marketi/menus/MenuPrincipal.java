package com.marketi.menus;

import java.util.Arrays;
import com.marketi.auxiliares.Leitor;
import com.marketi.entidades.Produto;
import com.marketi.armazenamento.Catalogo;

public class MenuPrincipal extends Menus {

    public MenuPrincipal(Catalogo catalogo) {
        super(catalogo);
        opcoes = Arrays.asList(
                "1) Cadastrar novo produto",
                "2) Buscar produto por Id",
                "3) Remover Produto",
                "4) Listar todos os produtos",
                "5) Mudar preço de um produto",
                "6) Sair");
    }

    @Override
    public void executar() {
        // executa o menu principal e permite que o usuário escolha uma das opções
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
        // Busca um produto por id, caso ele exista.
        String idDoProduto = Leitor.lerString("Digite o id do produto: ");
        Produto produto = catalogo.encontrarProduto(idDoProduto);
        if (produto != null) {
            return produto;
        }
        System.out.println("Produto não encontrado.");
        return buscarProdutoPorId(); // Reexecuta a função caso o id não exista
    }

    public void removerProduto() {
        // Remove um produto do catálogo, caso ele exista. Pede confirmação do usuário
        // para apagar o produto, permitindo que ele cancele a ação
        Produto produto = buscarProdutoPorId(); // Busca e checagem da existência do produto é feita dentro do método
                                                // buscarProdutoPorId()
        System.out.printf("Tem certeza que deseja apagar %s %s?%n", produto.getMarca(), produto.getModelo());
        String resposta = Leitor.lerString("(s/n): "); // Confirmação do usuário
        if (resposta.equals("s")) {
            catalogo.remover(produto);
            System.out.printf("%s removido.%n", produto.getModelo());
        } else {
            System.out.println("Ação cancelada.");
        }
    }

    public void mudarPrecoDeProduto() {
        // Muda o preço de um produto, caso ele exista
        Produto produto = buscarProdutoPorId(); // Busca e checagem da existência do produto
        // Imprime os dados do produto para conferência do usuário
        System.out.printf("Marca: %s%n", produto.getMarca());
        System.out.printf("Modelo: %s%n", produto.getModelo());
        System.out.printf("Preço atual: %.2f%n", produto.getPreco());
        double novoPreco = Leitor.lerDouble("Digite o novo preço do produto: ");
        produto.setPreco(novoPreco);
        System.out.printf("Preço de %s atualizado para %.2f%n", produto.getModelo(), produto.getPreco());
    }

    public void listarTodosOsProdutos() {
        // Lista todos os produtos do catálogo, ordenado de acordo com a escolha de
        // ordenação do usuário
        MenuOrdenacao menuOrdenacao = new MenuOrdenacao(catalogo);
        menuOrdenacao.executar();
        System.out.println(catalogo);
    }
}
