package com.marketi.entidades;

public class Computador extends Produto{
    int memoriaRam, armazenamento;
    String sistemaOperacional;

    Computador(String id, 
                String marca, 
                String modelo, 
                String lote, 
                double precoBase, 
                double desconto,
                int memoriaRam,
                int armazenamento,
                String sistemaOperacional) {
        super(id, marca, modelo, lote, precoBase, desconto);
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

}