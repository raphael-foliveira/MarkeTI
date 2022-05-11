package com.marketi.armazenamento;

import java.util.ArrayList;
import java.util.Comparator;
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

    public Produto encontrarId(String id){

        for (Produto produto : produtos) {
            if(produto.getId().equals(id)){
                return produto;
            }
        }

        return null;
    }

    public void ordenacaoId(){

        produtos.sort(Comparator.comparing(Produto::getId));
    }

    public void ordenacaoPreco(){
        produtos.sort(Comparator.comparing(Produto::getMarca));
    }

    public void adicionarProdutos(){

        adicionar(
        new Produto (

        "1", 
        "Razer",
        "Kraken", 
        "10",
        399));

        new Monitor(

        "2",
        "Acer",
        "VA270H",
        "A1098",
        1800,
        29,
        144,
        "1920x1080",
        "LED");

        new Computador(

        "3",
        "Apple",
        "Macbook Pro",
         "AAP298342893",
        23000,
        16,
        1000,
        "OSX");

        new Auricular(

        "4", 
        "Razer", 
        "Kraken", 
        "RK21983747", 
        680, 
        180, 
        110, 
        "USB");
        
    }
    
    public List<Produto> getProdutos(){
        return produtos;
    }

}
