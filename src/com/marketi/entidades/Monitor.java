package com.marketi.entidades;

public class Monitor extends Produto {

    int tamanho, taxaDeAtualizacao;
    String resolucao, tipoDeTela;

    public Monitor(
        String marca, 
        String modelo, 
        String lote,
        double preco, 
        int tamanho, 
        int taxaDeAtualizacao, 
        String resolucao, 
        String tipoDeTela
    ) {
        super(marca, modelo, lote, preco);
        this.tamanho = tamanho;
        this.taxaDeAtualizacao = taxaDeAtualizacao;
        this.resolucao = resolucao;
        this.tipoDeTela = tipoDeTela;
    }

}