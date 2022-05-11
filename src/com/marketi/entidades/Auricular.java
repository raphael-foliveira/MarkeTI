package com.marketi.entidades;

public class Auricular extends Produto {

    int impedancia, tamanhoDriver, sensibilidade;
    String conector;

    public Auricular( 
        String id,
        String marca, 
        String modelo,
        String lote, 
        double preco, 
        int tamanhoDriver,
        int sensibilidade,
        String conector
    ) {
        super(id, marca, modelo, lote, preco);
        this.tamanhoDriver = tamanhoDriver;
        this.sensibilidade = sensibilidade;
        this.conector = conector;
    }

}