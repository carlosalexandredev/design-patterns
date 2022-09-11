package dev.carlos.designpatters.creational.singleton.exemplo_01;

public class App {
    public static void main(String[] args) {
        ArquivoLog arquivoLog = ArquivoLog.getInstance();
        ArquivoLog arquivoLog1 = ArquivoLog.getInstance();
    }
}
