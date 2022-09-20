package dev.carlos.designpatters.structural.bridge.exemplo_01.window;

public class IconWindow extends Window{

    public void drawBorder() {
       drawRect();
       drawText();
    }
}
