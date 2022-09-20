package dev.carlos.designpatters.structural.adapter.exemplo_02;

import java.math.BigDecimal;

// Adaptee
class SdkPagamentoCredito { // .jar / lib no maven

    // posso até ter acesso, mas não convém alterar

    void autorizar(BigDecimal valor) {
        // autoriza
    }

    void capturar(BigDecimal valor) {
        // captura
    }

    void creditar(BigDecimal valor) {
        // credita
    }

}
