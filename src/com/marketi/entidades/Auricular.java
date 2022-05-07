package com.marketi.entidades;

public class Auricular extends Produto {

    final int impedancia, sensibilidade;
    final String conexao;

    public Auricular(
            String id,
            String marca,
            String modelo,
            String lote,
            double preco,
            int impedancia,
            int sensibilidade,
            String conexao) {
        super(id, marca, modelo, lote, preco);
        this.impedancia = impedancia;
        this.sensibilidade = sensibilidade;
        this.conexao = conexao;
        this.categoria = "Auriculares";
    }

    @Override
    public String toString() {
        return String.format(
                super.toString() + "Impedância(Ohms): %d%nSensibilidade(dB): %d%nConector: %s%n",
                impedancia,
                sensibilidade,
                conexao);
    }

}