package com.marketi.menus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.marketi.armazenamento.*;
import com.marketi.auxiliares.Leitor;

public class MenuOrdenacao extends Menu {
    

    MenuOrdenacao(Catalogo catalogo){

        super(catalogo);

        opcoes = Arrays.asList(
            "1) Id", 
                 "2) Preço", 
                 "3) Modelo", 
                 "4) Voltar ao menu principal");

    }


    @Override
    public void executar(){
        Linha();
        System.out.println("Escolha a opção para ordenar os dados: ");
        MostrarOpcoes();

        int opcao = Leitor.lerInt(">>>");

        switch (opcao) {
            case 1:

            catalogo.ordenacaoId();
                
                break;

            case 2:

            catalogo.ordenacaoPreco();
        
            default:
                break;
        }
    }

}
