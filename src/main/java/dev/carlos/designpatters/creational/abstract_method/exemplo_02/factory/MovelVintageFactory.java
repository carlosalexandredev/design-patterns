package dev.carlos.designpatters.creational.abstract_method.exemplo_02.factory;

import dev.carlos.designpatters.creational.abstract_method.exemplo_02.cadeira.Cadeira;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.cadeira.CadeiraVintage;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.cadeira.CadeiraVitoriana;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.mesa.Mesa;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.mesa.MesaVintage;

public class MovelVintageFactory implements MovelFactory {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraVintage();
    }

    @Override
    public Mesa criaMesa() {
        return new MesaVintage();
    }
}
