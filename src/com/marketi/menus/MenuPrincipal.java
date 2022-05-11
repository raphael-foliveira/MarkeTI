package com.marketi.menus;

import com.marketi.entidades.*;
import com.marketi.auxiliares.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.marketi.armazenamento.*;

public class MenuPrincipal extends Menu {
    
    public MenuPrincipal(Catalogo catalogo){
        
        super(catalogo);

        List <String> opcoes = Arrays.asList(
            
"1) Cadastrar novo produto", 
      "2) Buscar produto por Id",
      "3) Remover Produto",
      "4) Listar todos os produtos",
      "5) Mudar preço de um produto",
      "6) Sair");
    }

    public void executar(){
        Linha();
        System.out.println("Menu Principal");
        MostrarOpcoes();
        int opcao = Leitor.LerInt(">>>");

        switch (opcao) {
            case 1:

            break;

            case 2:

            break;

            case 3:

            break;

            case 4:

            break;

            case 5:

            break;

            case 6:

            System.out.println("Volte sempre");
            System.exit(0);
                
                break;
        
            default:

            System.out.println("Opção Inválida, tente novamente");
                break;
        }

        executar();
    }
}
