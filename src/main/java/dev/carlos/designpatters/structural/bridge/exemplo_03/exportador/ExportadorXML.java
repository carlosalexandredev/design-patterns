package dev.carlos.designpatters.structural.bridge.exemplo_03.exportador;

import dev.carlos.designpatters.structural.bridge.exemplo_03.extrato.Extrato;

import java.io.FileWriter;
import java.io.IOException;

public class ExportadorXML extends Exportador {
    public ExportadorXML(Extrato extrato) {
        super(extrato);
    }

    public void gerarArquivo(){
        gerarArquivo("xml");
    }
}
