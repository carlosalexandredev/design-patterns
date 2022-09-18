package dev.carlos.designpatters.creational.prototype.exemplo_01;

import lombok.Data;

@Data
public class CarroPrototypeConcreto2 extends VeiculoPrototype {
    private String cor;
    private Integer qtdPortas;
    private String cambio;

    @Override
    public VeiculoPrototype clone() {
        CarroPrototypeConcreto2 novo = new CarroPrototypeConcreto2();
        novo.setCor(this.cor);
        novo.setQtdPortas(this.qtdPortas);
        novo.setCambio(this.cambio);
        return novo;
    }
}
