package com.marketi.entidades;

public class Auriculares extends Produto {

    int impedancia, tamanhoDriver, sensibilidade;
    String conector;

    Auriculares(String id, 
                String marca, 
                String modelo, 
                String lote, 
                double precoBase, 
                double desconto,
                int impedancia,
                int tamanhoDriver,
                int sensibilidade,
                String conector) {
        super(id, marca, modelo, lote, precoBase, desconto);
        this.impedancia = impedancia;
        this.tamanhoDriver = tamanhoDriver;
        this.sensibilidade = sensibilidade;
        this.conector = conector;
    }

}