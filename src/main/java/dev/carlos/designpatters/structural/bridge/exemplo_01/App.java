package dev.carlos.designpatters.structural.bridge.exemplo_01;

import dev.carlos.designpatters.structural.bridge.exemplo_01.window.IconWindow;
import dev.carlos.designpatters.structural.bridge.exemplo_01.window.TransienWindow;
import dev.carlos.designpatters.structural.bridge.exemplo_01.windowImp.PMWindowImp;
import dev.carlos.designpatters.structural.bridge.exemplo_01.windowImp.XWindowImp;

public class App {
    public static void main(String[] args) {
        IconWindow ic = new IconWindow();
        ic.setImp(new PMWindowImp());
        ic.drawRect();

        IconWindow ic2 = new IconWindow();
        ic2.setImp(new XWindowImp());
        ic2.drawRect();

        TransienWindow tran = new TransienWindow();
        tran.setImp(new PMWindowImp());
        tran.drawRect();

        TransienWindow tran2 = new TransienWindow();
        tran2.setImp(new XWindowImp());
        tran2.drawRect();
    }
}
