package dev.carlos.designpatters.structural.adpter.exemplo_01;

import java.math.BigDecimal;

public class Adapter {

    public static void main(String[] args) {
        MeuPagamentoCredito credito = new MeuPagamentoCredito();
        credito.debitar(new BigDecimal("100"));
    }
}
