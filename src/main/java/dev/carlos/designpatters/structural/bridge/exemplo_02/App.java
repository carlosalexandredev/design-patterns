package dev.carlos.designpatters.structural.bridge.exemplo_02;

import dev.carlos.designpatters.structural.bridge.exemplo_02.dispositivo.DispositivoRadioSamsung;
import dev.carlos.designpatters.structural.bridge.exemplo_02.dispositivo.DispositivoTVLG;
import dev.carlos.designpatters.structural.bridge.exemplo_02.dispositivo.DispositivoTVSony;
import dev.carlos.designpatters.structural.bridge.exemplo_02.controle.ControleRemotoBasicoBridge;
import dev.carlos.designpatters.structural.bridge.exemplo_02.controle.ControleRemotoTouchBridge;

public class App {

    public static void main(String[] args) {
        ControleRemotoTouchBridge ctTouch1 = new ControleRemotoTouchBridge(new DispositivoTVLG());
        ControleRemotoTouchBridge ctTouch2 = new ControleRemotoTouchBridge(new DispositivoTVSony());
        ControleRemotoTouchBridge ctTouch3 = new ControleRemotoTouchBridge(new DispositivoRadioSamsung());

        ControleRemotoBasicoBridge ctBasico1 = new ControleRemotoBasicoBridge(new DispositivoTVLG());
        ControleRemotoBasicoBridge ctBasico2 = new ControleRemotoBasicoBridge(new DispositivoTVSony());
        ControleRemotoBasicoBridge ctBasico3 = new ControleRemotoBasicoBridge(new DispositivoRadioSamsung());
    }

}
