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
        this.categoria = "Monitor";
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(
                String.format(
                        "|%5s|%10s|%15s|%20s|%10s|%15s|%15s|%10s|%10s|%n",
                        "Id",
                        "Categoria",
                        "Marca",
                        "Modelo",
                        "Preço",
                        "Lote",
                        "Tx. atualização",
                        "Resolução",
                        "Tipo Tela"));
        builder.append(
                String.format(
                        "|%5s|%10s|%15s|%20s|R$%8.2f|%15s|%13sHz|%10s|%10s|%n",
                        id,
                        categoria,
                        marca,
                        modelo,
                        preco,
                        lote,
                        taxaDeAtualizacao,
                        resolucao,
                        tipoDeTela));
        return builder.toString();

    }

}