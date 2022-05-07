package com.marketi.menus.menuscmd;

import java.util.ArrayList;

import com.marketi.armazenamento.Catalogo;
import com.marketi.entidades.Computador;
import com.marketi.entidades.Produto;
import com.marketi.menus.MenuCmd;

public class MenuCadastro extends MenuCmd {
    
    public MenuCadastro(Catalogo catalogo){
        super(catalogo);
        this.titulo = "Cadastrar novo produto";
        this.opcoes = new ArrayList<>();
        this.opcoes.add("1) Produto");
        this.opcoes.add("2) Computador");
        this.opcoes.add("3) Monitor");
        this.opcoes.add("4) Auricular");
        this.opcoes.add("5) Voltar");
    }

    public void executar(){
        int opcao = pegarSelecaoUsuario();
        switch (opcao) {
            case 1:
                cadastrarProduto();
                break;
            case 2:
                cadastrarComputador();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                MenuPrincipal menuPrincipal = new MenuPrincipal(catalogo);
                menuPrincipal.executar();
            default:
                break;
        }
    }

    private void cadastrarProduto(){
        System.out.println("Cadastrando um produto genérico");
        String id = lerString("Id: ");
        String marca = lerString("Marca: ");
        String modelo = lerString("Modelo: ");
        String lote = lerString("Lote: ");
        double preco = lerDouble("Preco: ");
        Produto novoProduto = new Produto(id, marca, modelo, lote, preco);
        catalogo.adicionar(novoProduto);
    }

    private void cadastrarComputador(){
        System.out.println("Cadastrando um computador");
        String id = lerString("Id: ");
        String marca = lerString("Marca: ");
        String modelo = lerString("Modelo: ");
        String lote = lerString("Lote: ");
        double preco = lerDouble("Preco: ");
        int memoriaRam = lerInt("RAM: ");
        int armazenamento = lerInt("Armazenamento(GB): ");
        String sistemaOperacional = lerString("Sistema operacional: ");
        Computador novoComputador = new Computador(id, marca, modelo, lote, preco, memoriaRam, armazenamento, sistemaOperacional);
        catalogo.adicionar(novoComputador);
    }

    private void cadastrarMonitor(){
        System.out.println("Cadastrando um monitor");
        String id = lerString("Id: ");
        String marca = lerString("Marca: ");
        String modelo = lerString("Modelo: ");
        String lote = lerString("Lote: ");
        double preco = lerDouble("Preco: ");
        Produto novoProduto = new Produto(id, marca, modelo, lote, preco);
        catalogo.adicionar(novoProduto);
    }
    
    private void cadastrarAuricular(){
        System.out.println("Cadastrando um produto genérico");
        String id = lerString("Id: ");
        String marca = lerString("Marca: ");
        String modelo = lerString("Modelo: ");
        String lote = lerString("Lote: ");
        double preco = lerDouble("Preco: ");
        Produto novoProduto = new Produto(id, marca, modelo, lote, preco);
        catalogo.adicionar(novoProduto);
    }
}
