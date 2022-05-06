package com.marketi.entidades;

public class Computador extends Produto{
    int memoriaRam, armazenamento;
    String sistemaOperacional;

    public Computador(
        String marca, 
        String modelo, 
        String lote, 
        double preco, 
        int memoriaRam,
        int armazenamento,
        String sistemaOperacional
    ) {
        super(marca, modelo, lote, preco);
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

}