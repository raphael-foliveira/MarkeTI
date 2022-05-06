package com.marketi.entidades;


public class Produto {
    String id, marca, modelo, lote;
    double precoBase, desconto;

    Produto(String id, String marca, String modelo, String lote, double precoBase, double desconto){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.lote = lote;
        this.precoBase = precoBase;
        this.desconto = desconto; 
    }
}