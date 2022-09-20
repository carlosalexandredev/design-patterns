package dev.carlos.designpatters.structural.bridge.exemplo_03.extrato;

public class ExtratoCliente implements Extrato{
    @Override
    public String tipo() {
        return "Cliente";
    }

}
