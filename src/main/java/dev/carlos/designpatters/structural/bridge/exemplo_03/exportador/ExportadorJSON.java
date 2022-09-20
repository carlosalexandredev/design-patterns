package dev.carlos.designpatters.structural.bridge.exemplo_03.exportador;

import dev.carlos.designpatters.structural.bridge.exemplo_03.extrato.Extrato;

import java.io.FileWriter;
import java.io.IOException;

public class ExportadorJSON extends Exportador {
    public ExportadorJSON(Extrato extrato) {
        super(extrato);
    }

    public void gerarArquivo(){
        gerarArquivo("json");
    }
}
