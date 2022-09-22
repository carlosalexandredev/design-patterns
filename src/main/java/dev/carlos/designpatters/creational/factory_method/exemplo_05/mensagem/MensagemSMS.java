package dev.carlos.designpatters.creational.factory_method.exemplo_05.mensagem;

import javax.swing.*;

public class MensagemSMS implements Mensagem{
    @Override
    public void enviarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null , "SMS: " + mensagem);
    }
}
