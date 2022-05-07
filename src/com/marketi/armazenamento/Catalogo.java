package com.marketi.armazenamento;

import java.util.ArrayList;
import com.marketi.entidades.*;

public class Catalogo {
    ArrayList<Produto> produtos;

    Catalogo(){
        produtos = new ArrayList<Produto>();
    }

    protected void adicionar(Produto produto){
        produtos.add(produto);
    }

    protected void remover(Produto produto){
        produtos.remove(produto);
    }

    protected void remover(String id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)){
                produtos.remove(produto);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Catalogo [produtos=" + produtos + "]";
    }

    
}