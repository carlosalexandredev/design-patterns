package dev.carlos.designpatters.creational.factory_method.exemplo_05.mensagem;

public class MensagemFactory{

    /** Factory Method */
    public static Mensagem getMensagem(TipoMensagem tipoMensagem) {
        switch (tipoMensagem){
            case SMS -> {return new MensagemSMS();}
            case E_MAIL -> {return new MensagemEmail();}
            case WHATSAPP -> {return new MensagemWhatsapp();}
            default -> { throw new IllegalArgumentException("Opção de tipo de mensagem inválida!");}
        }
    }
}
