package dev.carlos.designpatters.structural.bridge.exemplo_03;

import dev.carlos.designpatters.structural.bridge.exemplo_03.exportador.ExportadorCSV;
import dev.carlos.designpatters.structural.bridge.exemplo_03.exportador.ExportadorJSON;
import dev.carlos.designpatters.structural.bridge.exemplo_03.exportador.ExportadorXML;
import dev.carlos.designpatters.structural.bridge.exemplo_03.extrato.ExtratoCliente;
import dev.carlos.designpatters.structural.bridge.exemplo_03.extrato.ExtratoVendedor;

public class App {
    public static void main(String[] args) {
        ExportadorXML exXMLVdd = new ExportadorXML(new ExtratoVendedor());
        exXMLVdd.gerarArquivo();
        ExportadorXML exXMLClt = new ExportadorXML(new ExtratoCliente());
        exXMLClt.gerarArquivo();

        ExportadorJSON exJSONVdd = new ExportadorJSON(new ExtratoVendedor());
        exJSONVdd.gerarArquivo();
        ExportadorJSON exJSONClt = new ExportadorJSON(new ExtratoCliente());
        exJSONClt.gerarArquivo();

        ExportadorCSV exportadorCSV = new ExportadorCSV(new ExtratoCliente());
        exportadorCSV.gerarArquivo();

    }
}
