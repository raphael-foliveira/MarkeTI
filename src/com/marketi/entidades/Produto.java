package com.marketi.entidades;

import com.marketi.auxiliares.FormatadorProduto;

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
        this.categoria = "Diverso";
    }

    @Override
    public String toString() {
        return FormatadorProduto.formatarProduto(this);
    }

    public String getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

}