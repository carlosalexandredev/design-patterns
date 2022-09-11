package dev.carlos.designpatters.creational.abstract_method.exemplo_01.factory;

import dev.carlos.designpatters.creational.abstract_method.exemplo_01.roda.Roda;
import dev.carlos.designpatters.creational.abstract_method.exemplo_01.roda.RodaSimples;
import dev.carlos.designpatters.creational.abstract_method.exemplo_01.som.Som;
import dev.carlos.designpatters.creational.abstract_method.exemplo_01.som.TocaFitas;

public class CarroPopularFactory extends CarroFactory{
    public Roda montarRoda() {
        return new RodaSimples();
    }

    public Som montarSom() {
        return new TocaFitas();
    }
}
