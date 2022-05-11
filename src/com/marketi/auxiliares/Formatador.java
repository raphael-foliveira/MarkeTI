package com.marketi.auxiliares;

import com.marketi.armazenamento.Catalogo;
import com.marketi.entidades.Auricular;
import com.marketi.entidades.Computador;
import com.marketi.entidades.Monitor;
import com.marketi.entidades.Produto;

public class Formatador {

        Formatador() {

        }

        public static String formatarProduto(Monitor monitor) {
                StringBuilder builder = new StringBuilder();

                builder.append(
                        String.format(
                                "|%5s|%10s|%15s|%20s|%10s|%15s|%15s|%10s|%10s|%n",
                                "Id",
                                "Categoria",
                                "Marca",
                                "Modelo",
                                "Preço",
                                "Lote",
                                "Tx. atualização",
                                "Resolução",
                                "Tipo Tela"));
                builder.append(
                        String.format(
                                "|%5s|%10s|%15s|%20s|R$%8.2f|%15s|%13sHz|%10s|%10s|%n",
                                monitor.getId(),
                                monitor.getCategoria(),
                                monitor.getMarca(),
                                monitor.getModelo(),
                                monitor.getPreco(),
                                monitor.getLote(),
                                monitor.getTaxaDeAtualizacao(),
                                monitor.getResolucao(),
                                monitor.getTipoDeTela()));
                return builder.toString();
        }

        public static String formatarProduto(Computador computador) {
                StringBuilder builder = new StringBuilder();

                builder.append(
                        String.format(
                                "|%5s|%10s|%15s|%20s|%10s|%20s|%15s|%13s|%20s|%n",
                                "Id",
                                "Categoria",
                                "Marca",
                                "Modelo",
                                "Preço",
                                "Lote",
                                "Memória RAM",
                                "Armazenamento",
                                "Sistema Operacional"));
                builder.append(
                        String.format(
                                "|%5s|%10s|%15s|%20s|R$%8.2f|%20s|%13sGB|%11sGB|%20s|%n",
                                computador.getId(),
                                computador.getCategoria(),
                                computador.getMarca(),
                                computador.getModelo(),
                                computador.getPreco(),
                                computador.getLote(),
                                computador.getMemoriaRam(),
                                computador.getArmazenamento(),
                                computador.getSistemaOperacional()));
                return builder.toString();
        }

        public static String formatarProduto(Auricular auricular) {

                StringBuilder builder = new StringBuilder();
                builder.append(
                        String.format(
                                "|%5s|%10s|%15s|%20s|%10s|%20s|%15s|%13s|%10s|%n",
                                "Id",
                                "Categoria",
                                "Marca",
                                "Modelo",
                                "Preço",
                                "Lote",
                                "Impedância",
                                "Sensibilidade",
                                "Conexão"));
                builder.append(
                        String.format(
                                "|%5s|%10s|%15s|%20s|R$%8.2f|%20s|%11sOhms|%11sdB|%10s|%n",
                                auricular.getId(),
                                auricular.getCategoria(),
                                auricular.getMarca(),
                                auricular.getModelo(),
                                auricular.getPreco(),
                                auricular.getLote(),
                                auricular.getImpedancia(),
                                auricular.getSensibilidade(),
                                auricular.getConexao()));
                return builder.toString();
        }

        public static String formatarProduto(Produto produto) {
                StringBuilder builder = new StringBuilder();
                Object[] nomeAtributos = {"Id", "Categoria", "Marca", "Modelo", "Preço", "Lote"};
                Object[] valoresAtributos = { produto.getId(),
                                produto.getCategoria(),
                                produto.getMarca(),
                                produto.getModelo(),
                                produto.getPreco(),
                                produto.getLote() };
                builder.append(
                        String.format(
                                "|%5s|%10s|%15s|%20s|%10s|%15s|%n", nomeAtributos));
                builder.append(
                        String.format(
                                "|%5s|%10s|%15s|%20s|R$%8.2f|%15s|", valoresAtributos));

                return builder.toString();
        }

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
