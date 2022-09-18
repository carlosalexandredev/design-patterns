package dev.carlos.designpatters.creational.prototype.exemplo_01;

import lombok.Data;

@Data
public class CarroPrototypeConcreto1 extends VeiculoPrototype {

    @Override
    public VeiculoPrototype clone() {
        return new CarroPrototypeConcreto1();
    }
}
