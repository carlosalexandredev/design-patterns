package dev.carlos.designpatters.structural.bridge.exemplo_03.extrato;

public class ExtratoVendedor implements Extrato{
    @Override
    public String tipo() {
        return "Vendedor";
    }
}
