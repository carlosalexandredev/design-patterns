package dev.carlos.designpatters.structural.bridge.exemplo_03.exportador;

import dev.carlos.designpatters.structural.bridge.exemplo_03.extrato.Extrato;
import lombok.Data;

import java.io.FileWriter;
import java.io.IOException;

@Data
public abstract class Exportador {
    private Extrato extrato;

    public Exportador(Extrato extrato) {
        this.extrato = extrato;
    }

    protected void exportaArquivo(String extencao){
        String fileName = String.format("%s.%s", getExtrato().tipo(), extencao);
        try {
            FileWriter fw  = new FileWriter(String.format("src/main/java/dev/carlos/designpatters/structural/bridge/exemplo_03/impreso/%s", fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    };
}
