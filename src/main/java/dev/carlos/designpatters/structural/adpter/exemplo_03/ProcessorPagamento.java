package dev.carlos.designpatters.structural.adpter.exemplo_03;

import java.math.BigDecimal;

interface ProcessorPagamento {

    void debitar(BigDecimal valor);

    void creditar(BigDecimal valor);

}
