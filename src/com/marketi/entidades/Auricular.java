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
        this.categoria = "Auriculares";
    }

    @Override
    public String toString() {
        return String.format(
            super.toString() + "Impedância(Ohms): %d%nSensibilidade(dB): %d%nConector: %s%n",
            this.impedancia,
            this.sensibilidade,
            this.conector
            );
    }

}