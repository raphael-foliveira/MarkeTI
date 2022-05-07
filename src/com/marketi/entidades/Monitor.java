package com.marketi.entidades;

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
        String tipoDeTela
    ) {
        super(id, marca, modelo, lote, preco);
        this.tamanho = tamanho;
        this.taxaDeAtualizacao = taxaDeAtualizacao;
        this.resolucao = resolucao;
        this.tipoDeTela = tipoDeTela;
    }

    @Override
    public String toString() {
        return String.format(
            "%nId: %s%nMarca: %s%nModelo: %s%nPreço: %.2f%nLote: %s%nTamanho: %d%nTaxa de Atualização(Hz): %d%nResolução: %s%n", 
            this.id, 
            this.marca, 
            this.modelo, 
            this.preco, 
            this.lote,
            this.taxaDeAtualizacao,
            this.resolucao
            );
    }

}