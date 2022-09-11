package dev.carlos.designpatters.creational.singleton.exemplo_01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class ArquivoLog {
    private FileWriter arquivo;
    private static ArquivoLog log;

    private ArquivoLog(){
        try {
            this.arquivo = new FileWriter("src/main/java/dev/carlos/designpatters/creational/singleton/exemplo_01/teste.log");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Apenas quando não houver uma instancia do objeto existente, crie uma.
     * */
    public static ArquivoLog getInstance(){
        if(Objects.isNull(log)){
            log = new ArquivoLog();
        }
        return log;
    }
}
