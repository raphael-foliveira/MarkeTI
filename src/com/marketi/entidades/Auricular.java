package com.marketi.entidades;

public class Auricular extends Produto {

    final int impedancia, sensibilidade;
    final String conector;

    public Auricular( 
        String id,
        String marca, 
        String modelo,
        String lote, 
        double preco, 
        int impedancia,
        int sensibilidade,
        String conector
    ) {
        super(id, marca, modelo, lote, preco);
        this.impedancia = impedancia;
        this.sensibilidade = sensibilidade;
        this.conector = conector;
    }

    public String toString() {
        return String.format(
            "%nId: %s%nMarca: %s%nModelo: %s%nPreço: %.2f%nLote: %s%nImpedância(Ohms): %d%nSensibilidade(dB): %d%nConector: %s%n", 
            this.id, 
            this.marca, 
            this.modelo, 
            this.preco, 
            this.lote,
            this.impedancia,
            this.sensibilidade,
            this.conector
            );
    }

}