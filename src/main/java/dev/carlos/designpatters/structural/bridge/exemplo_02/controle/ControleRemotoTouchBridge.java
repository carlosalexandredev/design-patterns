package dev.carlos.designpatters.structural.bridge.exemplo_02.controle;

import dev.carlos.designpatters.structural.bridge.exemplo_02.dispositivo.Dispositivo;

public class ControleRemotoTouchBridge extends ControleRemoto {
    public ControleRemotoTouchBridge(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void aumentarVolume() {

    }

    @Override
    public void diminuirVolume() {

    }

    @Override
    public void mudarCanal() {

    }
}
