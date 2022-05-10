package com.marketi.entidades;

import com.marketi.auxiliares.FormatadorProduto;

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
        this.categoria = "Computador";
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String toString() {
        return FormatadorProduto.formatarProduto(this);
    }
}