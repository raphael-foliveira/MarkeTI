package com.marketi.entidades;


public class Produto {
    String id;
    String marca, modelo, lote;
    double preco;

    public Produto(
        String id,
        String marca, 
        String modelo, 
        String lote, 
        double precoBase
    ) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.lote = lote;
        this.preco = precoBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public double getPrecoBase() {
        return preco;
    }

    public void setPrecoBase(double precoBase) {
        this.preco = precoBase;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", lote=" + lote + ", marca=" + marca + ", modelo=" + modelo + ", preco=" + preco
                + "]";
    }

    
}