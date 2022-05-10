package com.marketi.ui.menuscmd;

import java.util.Arrays;

import com.marketi.armazenamento.Catalogo;
import com.marketi.entidades.Auricular;
import com.marketi.entidades.Computador;
import com.marketi.entidades.Monitor;
import com.marketi.entidades.Produto;
import com.marketi.ui.interfacecmd.UICmd;

public class MenuCadastrarProduto extends MenuOpcoes {
    // Classe responsável por mostrar as opções que o usuário tem para cadastrar um
    // novo produto no catálogo
    public MenuCadastrarProduto(Catalogo catalogo) {
        super(catalogo);
        this.opcoes = new UICmd(
                "Cadastrar Produto",
                Arrays.asList(
                        "1) Produto genérico",
                        "2) Computador",
                        "3) Monitor",
                        "4) Auricular",
                        "5) Voltar ao menu principal"));
    }

    @Override
    public void executar() {
        // executa o menu de cadastro e invoca o método de acordo com a escolha do
        // usuário
        System.out.println(linhaMenu);
        opcoes.mostrarOpcoes();
        int opcao = opcoes.lerSelecao();
        switch (opcao) {
            case 1:
                cadastrarProduto();
                break;
            case 2:
                cadastrarComputador();
                break;
            case 3:
                cadastrarMonitor();
                break;
            case 4:
                cadastrarAuricular();
                break;
            default:
                break;
        }
        MenuPrincipal menuPrincipal = new MenuPrincipal(catalogo);
        menuPrincipal.executar();
    }

    public void cadastrarProduto() {
        // lê os dados de um produto e cadastra o produto no catálogo
        System.out.println("Cadastrando produto genérico");
        String id = lerNovoId();
        String marca = opcoes.lerString("Marca: ");
        String modelo = opcoes.lerString("Modelo: ");
        String lote = opcoes.lerString("Lote: ");
        double preco = opcoes.lerDouble("Preço: ");
        catalogo.adicionar(new Produto(id, marca, modelo, lote, preco));
    }

    public void cadastrarComputador() {
        // lê os dados de um computador e cadastra no catálogo
        System.out.println("Cadastrando computador");
        String id = lerNovoId();
        String marca = opcoes.lerString("Marca: ");
        String modelo = opcoes.lerString("Modelo: ");
        String lote = opcoes.lerString("Lote: ");
        double preco = opcoes.lerDouble("Preço: ");
        int memoriaRam = opcoes.lerInt("RAM: ");
        int armazenamento = opcoes.lerInt("Armazenamento(GB): ");
        String sistemaOperacional = opcoes.lerString("Sistema operacional: ");
        catalogo.adicionar(
                new Computador(id, marca, modelo, lote, preco, memoriaRam, armazenamento, sistemaOperacional));
    }

    public void cadastrarMonitor() {
        // lê os dados de um monitor e cadastra no catálogo
        System.out.println("Cadastrando monitor");
        String id = lerNovoId();
        String marca = opcoes.lerString("Marca: ");
        String modelo = opcoes.lerString("Modelo: ");
        String lote = opcoes.lerString("Lote: ");
        double preco = opcoes.lerDouble("Preço: ");
        int tamanho = opcoes.lerInt("Tamanho (Polegadas): ");
        int taxaDeAtualizacao = opcoes.lerInt("Taxa de atualização (Hz): ");
        String resolucao = opcoes.lerString("Resolução: ");
        String tipoDeTela = opcoes.lerString("Tipo de tela: ");
        catalogo.adicionar(
                new Monitor(id, marca, modelo, lote, preco, tamanho, taxaDeAtualizacao, resolucao, tipoDeTela));
    }

    public void cadastrarAuricular() {
        // lê os dados de um auricular e cadastra no catálogo
        System.out.println("Cadastrando auricular");
        String id = lerNovoId();
        String marca = opcoes.lerString("Marca: ");
        String modelo = opcoes.lerString("Modelo: ");
        String lote = opcoes.lerString("Lote: ");
        double preco = opcoes.lerDouble("Preço: ");
        int impedancia = opcoes.lerInt("Impedancia : ");
        int sensibilidade = opcoes.lerInt("Sensibilidade(dB): ");
        String conector = opcoes.lerString("Tipo de conector: ");
        catalogo.adicionar(new Auricular(id, marca, modelo, lote, preco, impedancia, sensibilidade, conector));
    }

    public String lerNovoId() {
        // Evita que IDs repetidos sejam cadastrados
        String id = opcoes.lerString("Id: ");
        while (catalogo.encontrarProduto(id) != null) {
            System.out.println("Id já cadastrado. Tente novamente.");
            id = opcoes.lerString("Id: ");
        }
        return id;
    }

}
