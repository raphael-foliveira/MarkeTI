package com.marketi.entidades;

public class Computador extends Produto{
    int memoriaRam, armazenamento;
    String sistemaOperacional;

    public Computador(
        String id,
        String marca, 
        String modelo,
        String lote, 
        double preco, 
        int memoriaRam,
        int armazenamento,
        String sistemaOperacional
    ) {
        super(id, marca, modelo, lote, preco);
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

}