package com.marketi.armazenamento;

import java.util.ArrayList;
import java.util.List;

import com.marketi.entidades.*;

public class Catalogo {
    List<Produto> produtos;

    public Catalogo() {
        produtos = new ArrayList<Produto>();
    }

    public void adicionar(Produto produto) {
        // adiciona um produto
        produtos.add(produto);
    }

    public boolean remover(String id) {
        // remove um produto caso ele exista
        // retorna false se o produto não for encontrado
        Produto produto = encontrarProduto(id);
        if (produto == null) {
            return false;
        }
        produtos.remove(produto);
        return true;
    }

    public Produto encontrarProduto(String id) {
        // encontra um produto no catálogo baseado no seu id e o retorna, caso ele
        // exista
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null;
    }

    public String toString() {
        // Utiliza um StringBuilder para adicionar todos os elementos do catálogo a uma
        // String
        StringBuilder builder = new StringBuilder();

        builder.append(
                String.format("|%5s|%20s|%10s|%n", "Id", "Modelo", "Preço"));

        builder.append(String.format("%s%n", "---------------------------------------"));

        for (Produto produto : this.produtos) {
            // Cada produto é adicionado à string, sendo separado por uma quebra de linha
            builder.append(String.format("%s%n", produto.formatarParaListagem()));
        }
        return builder.toString();
    }

    public void adicionarProdutosDemo() {
        // adicionando produtos para preencher a lista e demonstrar o funcionamento do
        // sistema
        adicionar(
                new Produto(
                        "1",
                        "Zowie",
                        "Ec2A",
                        "10",
                        399));
        adicionar(
                new Computador(
                        "2",
                        "Dell",
                        "Onyx",
                        "155vx",
                        4900,
                        16,
                        512,
                        "Windows"));
        adicionar(
                new Auricular(
                        "3",
                        "JBL",
                        "125BT",
                        "KGBUX",
                        150,
                        220,
                        100,
                        "Bluetooth"));
        adicionar(
                new Monitor(
                        "4",
                        "Acer",
                        "VA270H",
                        "A1098",
                        1800,
                        29,
                        144,
                        "1920x1080",
                        "LED"));
        adicionar(
                new Produto(
                        "5",
                        "GFallen",
                        "Falcão Peregrino",
                        "GF21983",
                        399));
        adicionar(
                new Computador(
                        "6",
                        "Apple",
                        "Macbook Pro",
                        "AAP298342893",
                        23000,
                        16,
                        1000,
                        "OSX"));
        adicionar(
                new Auricular(
                        "7",
                        "Razer",
                        "Kraken",
                        "RK21983747",
                        680,
                        180,
                        110,
                        "USB"));
    }

}