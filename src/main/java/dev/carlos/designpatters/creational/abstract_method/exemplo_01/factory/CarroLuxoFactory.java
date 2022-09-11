package dev.carlos.designpatters.creational.abstract_method.exemplo_01.factory;

import dev.carlos.designpatters.creational.abstract_method.exemplo_01.som.CDPlayer;
import dev.carlos.designpatters.creational.abstract_method.exemplo_01.roda.Roda;
import dev.carlos.designpatters.creational.abstract_method.exemplo_01.roda.RodaLigaLeve;
import dev.carlos.designpatters.creational.abstract_method.exemplo_01.som.Som;

public class CarroLuxoFactory extends CarroFactory{
    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    public Som montarSom() {
        return new CDPlayer();
    }
}
