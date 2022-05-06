package com.marketi.entidades;

public class Monitor extends Produto {

    int tamanho, taxaDeAtualizacao;
    String resolucao, tipoDeTela;

    Monitor(String id, 
            String marca, 
            String modelo, 
            String lote, 
            double precoBase, 
            double desconto,
            int tamanho,
            int taxaDeAtualizacao,
            String resolucao,
            String tipoDeTela) {
        super(id, marca, modelo, lote, precoBase, desconto);
        this.tamanho = tamanho;
        this.taxaDeAtualizacao = taxaDeAtualizacao;
        this.resolucao = resolucao;
        this.tipoDeTela = tipoDeTela;
    }

}