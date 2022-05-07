package com.marketi.entidades;

public class Produto {
    final String id, marca, modelo, lote;
    String categoria;
    double preco;

    public Produto(
            String id,
            String marca,
            String modelo,
            String lote,
            double preco) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.lote = lote;
        this.preco = preco;
        this.categoria = "Diversos";
    }

    public String getId() {
        return id;
    }

    public String getLote() {
        return lote;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return String.format(
                "%nId: %s%nCategoria: %s%nMarca: %s%nModelo: %s%nPreço: %.2f%nLote: %s%n",
                this.id,
                this.categoria,
                this.marca,
                this.modelo,
                this.preco,
                this.lote);
    }

}