package dev.carlos.designpatters.creational.abstract_method.exemplo_01.factory;

import dev.carlos.designpatters.creational.abstract_method.exemplo_01.roda.Roda;
import dev.carlos.designpatters.creational.abstract_method.exemplo_01.som.Som;

public abstract class CarroFactory {
    public abstract Roda montarRoda();
    public abstract Som montarSom();
}
