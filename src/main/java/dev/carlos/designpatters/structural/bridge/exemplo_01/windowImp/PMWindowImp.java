package dev.carlos.designpatters.structural.bridge.exemplo_01.windowImp;

public class PMWindowImp extends WindowImp {
    @Override
    public void devDrawText() {
        System.out.println("Desenhou Texto PM");
    }

    @Override
    public void devDrawLine() {
        System.out.println("Desenhou Linha PM");
    }

}
