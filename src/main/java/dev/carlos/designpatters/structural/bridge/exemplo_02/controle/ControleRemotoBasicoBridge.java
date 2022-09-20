package dev.carlos.designpatters.structural.bridge.exemplo_02.controle;

import dev.carlos.designpatters.structural.bridge.exemplo_02.dispositivo.Dispositivo;

public class ControleRemotoBasicoBridge extends ControleRemoto {
    public ControleRemotoBasicoBridge(Dispositivo dispositivo) {
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
