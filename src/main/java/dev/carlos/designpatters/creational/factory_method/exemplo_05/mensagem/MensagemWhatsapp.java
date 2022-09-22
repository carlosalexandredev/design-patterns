package dev.carlos.designpatters.creational.factory_method.exemplo_05.mensagem;

import javax.swing.*;

public class MensagemWhatsapp implements Mensagem{
    @Override
    public void enviarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null , "WhatsApp: " + mensagem);
    }
}
