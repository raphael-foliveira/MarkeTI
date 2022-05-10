package com.marketi.entidades;

import com.marketi.auxiliares.FormatadorProduto;

public class Monitor extends Produto {

    final int tamanho, taxaDeAtualizacao;
    final String resolucao, tipoDeTela;

    public Monitor(
            String id,
            String marca,
            String modelo,
            String lote,
            double preco,
            int tamanho,
            int taxaDeAtualizacao,
            String resolucao,
            String tipoDeTela) {
        super(id, marca, modelo, lote, preco);
        this.tamanho = tamanho;
        this.taxaDeAtualizacao = taxaDeAtualizacao;
        this.resolucao = resolucao;
        this.tipoDeTela = tipoDeTela;
        this.categoria = "Monitor";
    }

    public int getTaxaDeAtualizacao() {
        return taxaDeAtualizacao;
    }

    public String getResolucao() {
        return resolucao;
    }

    public String getTipoDeTela() {
        return tipoDeTela;
    }

    public String toString() {
        return FormatadorProduto.formatarProduto(this);
    }
}