package dev.carlos.designpatters.structural.bridge.exemplo_01.windowImp;

public class XWindowImp extends WindowImp {
    @Override
    public void devDrawText() {
        System.out.println("Desenhou Texto X");
    }

    @Override
    public void devDrawLine() {
        System.out.println("Desenhou Linha X");
    }
}
