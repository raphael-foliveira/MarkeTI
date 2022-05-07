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
            String tipoDeTela) {
        super(id, marca, modelo, lote, preco);
        this.tamanho = tamanho;
        this.taxaDeAtualizacao = taxaDeAtualizacao;
        this.resolucao = resolucao;
        this.tipoDeTela = tipoDeTela;
        this.categoria = "Monitores";
    }

    @Override
    public String toString() {
        return String.format(
                super.toString() + "Taxa de Atualização(Hz): %s%nResolução: %s%nTipo de Tela: %s%n",
                this.taxaDeAtualizacao,
                this.resolucao,
                this.tipoDeTela);
    }

}