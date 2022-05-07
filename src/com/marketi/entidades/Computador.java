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

    @Override
    public String toString() {
        return String.format(
            "%nId: %s%nMarca: %s%nModelo: %s%nPreço: %.2f%nLote: %s%nRAM: %d%nArmazenamento(GB): %d%nSistema Operacional: %s%n", 
            this.id, 
            this.marca, 
            this.modelo, 
            this.preco, 
            this.lote,
            this.memoriaRam,
            this.armazenamento,
            this.sistemaOperacional
            );
    }

}