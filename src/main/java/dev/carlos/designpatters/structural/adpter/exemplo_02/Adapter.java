package dev.carlos.designpatters.structural.adpter.exemplo_02;

import java.math.BigDecimal;

public class Adapter {
    
    // Client
    public static void main(String[] args) {
        ProcessorPagamento credito = new MeuPagamentoCredito();
        credito.debitar(new BigDecimal("100"));
    }
    
}