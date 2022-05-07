package com.marketi.armazenamento;

import java.util.ArrayList;
import java.util.List;

import com.marketi.entidades.*;

public class Catalogo {
    List<Produto> produtos;

    public Catalogo(){
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

    public void imprimir(){
        for (Produto produto : this.produtos){
            System.out.println(produto);
        }
    }
}