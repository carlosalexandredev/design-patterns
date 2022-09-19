package dev.carlos.designpatters.structural.adpter.exemplo_02;

import java.math.BigDecimal;

// Target

interface ProcessorPagamento {

    void debitar(BigDecimal valor);

    void creditar(BigDecimal valor);

}
