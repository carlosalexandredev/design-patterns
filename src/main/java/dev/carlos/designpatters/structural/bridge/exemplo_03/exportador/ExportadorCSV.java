package dev.carlos.designpatters.structural.bridge.exemplo_03.exportador;

import dev.carlos.designpatters.structural.bridge.exemplo_03.extrato.Extrato;

public class ExportadorCSV extends Exportador {
    public ExportadorCSV(Extrato extrato) {
        super(extrato);
    }

    public void gerarArquivo(){
        gerarArquivo("csv");
    }
}
