package com.marketi.ui.interfacecmd;

public interface LeitorDeEntrada {
    // define os métodos que devem ser implementados pela UICmd/UISwing para ler
    // dados fornecidos pelo usuário
    public int lerInt(String mensagem);

    public String lerString(String mensagem);

    public double lerDouble(String mensagem);
}
