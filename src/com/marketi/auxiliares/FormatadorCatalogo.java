package com.marketi.auxiliares;

import com.marketi.armazenamento.Catalogo;
import com.marketi.entidades.Produto;

public class FormatadorCatalogo {

        public static String formatarProdutoLista(Produto produto) {
                return String.format(
                                "|%5s|%20s|R$%8.2f|",
                                produto.getId(),
                                produto.getModelo(),
                                produto.getPreco());
        }

        public static String formatarCatalogo(Catalogo catalogo) {
                StringBuilder builder = new StringBuilder();

                builder.append(
                                String.format("|%5s|%20s|%10s|%n", "Id", "Modelo", "Preço"));

                builder.append(String.format("%s%n", "---------------------------------------"));

                for (Produto produto : catalogo.getProdutos()) {
                        // Cada produto é adicionado à string, sendo separado por uma quebra de linha
                        builder.append(String.format("%s%n", formatarProdutoLista(produto)));
                }
                return builder.toString();
        }

}
