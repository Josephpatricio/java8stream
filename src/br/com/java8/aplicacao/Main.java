package br.com.java8.aplicacao;

import br.com.java8.dominio.FormaPagamento;
import br.com.java8.dominio.Venda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Venda> vendas = new ArrayList<Venda>(){{
            add(new Venda(400, FormaPagamento.CARTAO));
            add(new Venda(200, FormaPagamento.CARTAO));
            add(new Venda(220, FormaPagamento.CARTAO));
            add(new Venda(280, FormaPagamento.DINHEIRO));
        }};

        vendas.stream()
                .filter(venda -> venda.getFormaPagamento() == FormaPagamento.CARTAO)
                .sorted(Comparator.comparing(Venda::getFormaPagamento))
                .map(Venda::getTotal)
                .forEach(System.out::println);
    }
}
