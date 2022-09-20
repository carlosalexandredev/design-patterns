package dev.carlos.designpatters.structural.bridge.exemplo_02.controle;


import dev.carlos.designpatters.structural.bridge.exemplo_02.dispositivo.Dispositivo;

/**
 * A Abstração fornece a lógica de controle de alto nível.
 * Ela depende do objeto de implementação para fazer o verdadeiro trabalho de baixo nível.
 */
public abstract class ControleRemoto {

    private Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void ligar();
    public abstract void desligar();
    public abstract void aumentarVolume();
    public abstract void diminuirVolume();
    public abstract void mudarCanal();

}
