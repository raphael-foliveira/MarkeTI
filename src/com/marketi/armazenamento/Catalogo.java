package com.marketi.armazenamento;

import java.util.ArrayList;
import com.marketi.entidades.*;

public class Catalogo {
    ArrayList<Produto> produtos;

    Catalogo(){
        produtos = new ArrayList<Produto>();
    }

    public void adicionar(Produto produto){
        produtos.add(produto);
    }

    public void remover(Produto produto){
        produtos.remove(produto);
    }

    public void remover(String id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)){
                produtos.remove(produto);
                return;
            }
        }
    }
}