package dev.carlos.designpatters.structural.adapter.exemplo_02;

import java.math.BigDecimal;

// Adapter

class MeuPagamentoCredito implements ProcessorPagamento {
    SdkPagamentoCredito sdkPagamentoCredito = new SdkPagamentoCredito();

    public void debitar(BigDecimal valor) {
        // ..
        sdkPagamentoCredito.autorizar(valor);
        sdkPagamentoCredito.capturar(valor);
    }

    public void creditar(BigDecimal valor) {
        // ..
        sdkPagamentoCredito.creditar(valor);
    }

}
