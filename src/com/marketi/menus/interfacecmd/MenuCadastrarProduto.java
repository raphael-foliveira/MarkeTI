package com.marketi.menus.interfacecmd;

import java.util.Arrays;

import com.marketi.armazenamento.Catalogo;
import com.marketi.entidades.Auricular;
import com.marketi.entidades.Computador;
import com.marketi.entidades.Monitor;
import com.marketi.entidades.Produto;

public class MenuCadastrarProduto {

    Catalogo catalogo;
    UISelecaoCmd menu;

    public MenuCadastrarProduto(Catalogo catalogo) {
        this.catalogo = catalogo;
        this.menu = new UISelecaoCmd(
                "Cadastrar Produto",
                Arrays.asList(
                        "1) Produto genérico",
                        "2) Computador",
                        "3) Monitor",
                        "4) Auricular",
                        "5) Voltar ao menu principal"));
    }

    public void executar() {
        this.menu.mostrarOpcoes();
        int opcao = this.menu.lerSelecao();
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
        System.out.println("Cadastrando produto genérico");
        String id = lerNovoId();
        String marca = this.menu.lerString("Marca: ");
        String modelo = this.menu.lerString("Modelo: ");
        String lote = this.menu.lerString("Lote: ");
        double preco = this.menu.lerDouble("Preço: ");
        this.catalogo.adicionar(new Produto(id, marca, modelo, lote, preco));
    }

    public void cadastrarComputador() {
        System.out.println("Cadastrando computador");
        String id = lerNovoId();
        String marca = this.menu.lerString("Marca: ");
        String modelo = this.menu.lerString("Modelo: ");
        String lote = this.menu.lerString("Lote: ");
        double preco = this.menu.lerDouble("Preço: ");
        int memoriaRam = this.menu.lerInt("RAM: ");
        int armazenamento = this.menu.lerInt("Armazenamento(GB): ");
        String sistemaOperacional = this.menu.lerString("Sistema operacional: ");
        this.catalogo.adicionar(
                new Computador(id, marca, modelo, lote, preco, memoriaRam, armazenamento, sistemaOperacional));
    }

    public void cadastrarMonitor() {
        System.out.println("Cadastrando monitor");
        String id = lerNovoId();
        String marca = this.menu.lerString("Marca: ");
        String modelo = this.menu.lerString("Modelo: ");
        String lote = this.menu.lerString("Lote: ");
        double preco = this.menu.lerDouble("Preço: ");
        int tamanho = this.menu.lerInt("Tamanho (Polegadas): ");
        int taxaDeAtualizacao = this.menu.lerInt("Taxa de atualização (Hz): ");
        String resolucao = this.menu.lerString("Resolução: ");
        String tipoDeTela = this.menu.lerString("Tipo de tela: ");
        this.catalogo.adicionar(
                new Monitor(id, marca, modelo, lote, preco, tamanho, taxaDeAtualizacao, resolucao, tipoDeTela));
    }

    public void cadastrarAuricular() {
        System.out.println("Cadastrando auricular");
        String id = lerNovoId();
        String marca = this.menu.lerString("Marca: ");
        String modelo = this.menu.lerString("Modelo: ");
        String lote = this.menu.lerString("Lote: ");
        double preco = this.menu.lerDouble("Preço: ");
        int impedancia = this.menu.lerInt("Impedancia : ");
        int sensibilidade = this.menu.lerInt("Sensibilidade(dB): ");
        String conector = this.menu.lerString("Tipo de conector: ");
        this.catalogo.adicionar(new Auricular(id, marca, modelo, lote, preco, impedancia, sensibilidade, conector));
    }

    public String lerNovoId() {
        // Evita que IDs repetidos sejam cadastrados
        String id = this.menu.lerString("Id: ");
        while (catalogo.verificarExistenciaDeId(id)) {
            System.out.println("Id já cadastrado. Tente novamente.");
            id = this.menu.lerString("Id: ");
        }
        return id;
    }

}
