package com.marketi.entidades;

public class Monitor extends Produto {

    int tamanho, taxaDeAtualizacao;
    String resolucao, tipoDeTela;

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
            "%nId: %s%nMarca: %s%n Modelo: %s%n Preço: %.2f%n Lote: %s%nTamanho: %d%n, Taxa de Atualização(Hz): %d%nResolução: %s%n", 
            this.id, 
            this.marca, 
            this.modelo, 
            this.preco, 
            this.lote);
        }

}