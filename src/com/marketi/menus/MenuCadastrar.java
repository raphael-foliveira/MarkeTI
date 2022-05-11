package com.marketi.menus;

import java.util.ArrayList;
import java.util.List;

import com.marketi.armazenamento.Catalogo;
import com.marketi.auxiliares.Leitor;
import com.marketi.entidades.Auricular;
import com.marketi.entidades.Computador;
import com.marketi.entidades.Monitor;
import com.marketi.entidades.Produto;

public class MenuCadastrar extends Menus {

    private Catalogo catalogo;
    private List<String> opcoes;

    public MenuCadastrar(Catalogo catalogo) {
        super(catalogo);
        opcoes = new ArrayList<>();
        opcoes.add("1) Diverso");
        opcoes.add("2) Auricular");
        opcoes.add("3) Computador");
        opcoes.add("4) Monitor");
        opcoes.add("5) Voltar ao menu principal");
    }

    public void executar() {
        printLinha();
        System.out.println("Cadastrando novo produto");
        mostrarOpcoes();
        int opcao = Leitor.lerInt(">>> ");
        switch (opcao) {
            case 1:
                cadastrarDiverso();
                break;
            case 2:
                cadastrarAuricular();
                break;
            case 3:
                cadastrarComputador();
                break;
            case 4:
                cadastrarMonitor();
                break;
            case 5:
                MenuPrincipal menuPrincipal = new MenuPrincipal(catalogo);
                menuPrincipal.executar();
                break;

            default:
                break;
        }
    }

    public void mostrarOpcoes() {
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    public void cadastrarDiverso() {
        System.out.println("Cadastrando produto diverso");
        String id = lerId();
        String marca = Leitor.lerString("Marca: ");
        String modelo = Leitor.lerString("Modelo: ");
        double preco = Leitor.lerDouble("Preço: ");
        String lote = Leitor.lerString("Lote: ");
        catalogo.adicionar(new Produto(id, marca, modelo, lote, preco));
    }

    public void cadastrarAuricular() {
        System.out.println("Cadastrando auricular");
        String id = lerId();
        String marca = Leitor.lerString("Marca: ");
        String modelo = Leitor.lerString("Modelo: ");
        String lote = Leitor.lerString("Lote: ");
        double preco = Leitor.lerDouble("Preço: ");
        int impedancia = Leitor.lerInt("Impedância: ");
        int sensibilidade = Leitor.lerInt("Sensibilidade: ");
        String conexao = Leitor.lerString("Conexão: ");
        catalogo.adicionar(new Auricular(id, marca, modelo, lote, preco, impedancia, sensibilidade, conexao));
    }

    public void cadastrarMonitor() {
        System.out.println("Cadastrando monitor");
        String id = lerId();
        String marca = Leitor.lerString("Marca: ");
        String modelo = Leitor.lerString("Modelo: ");
        String lote = Leitor.lerString("Lote: ");
        double preco = Leitor.lerDouble("Preço: ");
        int tamanho = Leitor.lerInt("Impedância: ");
        int taxaDeAtualizacao = Leitor.lerInt("Sensibilidade: ");
        String resolucao = Leitor.lerString("Conexão: ");
        String tipoDeTela = Leitor.lerString("Tipo de tela: ");
        catalogo.adicionar(
                new Monitor(id, marca, modelo, lote, preco, tamanho, taxaDeAtualizacao, resolucao, tipoDeTela));
    }

    public void cadastrarComputador() {
        System.out.println("Cadastrando computador");
        String id = lerId();
        String marca = Leitor.lerString("Marca: ");
        String modelo = Leitor.lerString("Modelo: ");
        String lote = Leitor.lerString("Lote: ");
        double preco = Leitor.lerDouble("Preço: ");
        int memoriaRam = Leitor.lerInt("Impedância: ");
        int armazenamento = Leitor.lerInt("Sensibilidade: ");
        String sistemaOperacional = Leitor.lerString("Conexão: ");
        catalogo.adicionar(
                new Computador(id, marca, modelo, lote, preco, memoriaRam, armazenamento, sistemaOperacional));
    }

    public String lerId() {
        String id = Leitor.lerString("Id: ");
        if (catalogo.encontrarProduto(id) == null) {
            return id;
        }
        System.out.println("Id já cadastrado. Use outro valor");
        return lerId();
    }

}
