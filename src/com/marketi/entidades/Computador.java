package com.marketi.entidades;

public class Computador extends Produto {
    final int memoriaRam, armazenamento;
    final String sistemaOperacional;

    public Computador(
            String id,
            String marca,
            String modelo,
            String lote,
            double preco,
            int memoriaRam,
            int armazenamento,
            String sistemaOperacional) {
        super(id, marca, modelo, lote, preco);
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
        this.categoria = "Computadores";
    }

    @Override
    public String toString() {
        return String.format(
                super.toString() + "RAM: %d%nArmazenamento(GB): %d%nSistema Operacional: %s%n",
                memoriaRam,
                armazenamento,
                sistemaOperacional);
    }
}