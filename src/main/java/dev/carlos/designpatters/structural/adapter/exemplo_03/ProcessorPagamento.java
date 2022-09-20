package dev.carlos.designpatters.structural.adapter.exemplo_03;

import java.math.BigDecimal;

interface ProcessorPagamento {

    void debitar(BigDecimal valor);

    void creditar(BigDecimal valor);

}
