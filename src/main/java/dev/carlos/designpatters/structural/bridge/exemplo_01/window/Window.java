package dev.carlos.designpatters.structural.bridge.exemplo_01.window;

import dev.carlos.designpatters.structural.bridge.exemplo_01.windowImp.WindowImp;
import lombok.Data;

@Data
public abstract class Window {
    WindowImp imp;

    public void drawRect(){
        imp.devDrawLine();
        imp.devDrawLine();
        imp.devDrawLine();
        imp.devDrawLine();
    }

    public void drawText(){
        imp.devDrawText();
    }
}
