package dev.carlos.designpatters.creational.factory_method.exemplo_05;

import dev.carlos.designpatters.creational.factory_method.exemplo_05.mensagem.Mensagem;
import dev.carlos.designpatters.creational.factory_method.exemplo_05.mensagem.MensagemFactory;
import dev.carlos.designpatters.creational.factory_method.exemplo_05.mensagem.TipoMensagem;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite sua mensagem:");

        Mensagem msg = MensagemFactory.getMensagem(TipoMensagem.E_MAIL);
        msg.enviarMensagem(texto);
    }
}
