package dev.carlos.designpatters.creational.abstract_method.exemplo_02.factory;

import dev.carlos.designpatters.creational.abstract_method.exemplo_02.cadeira.Cadeira;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.cadeira.CadeiraModerna;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.mesa.Mesa;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.mesa.MesaModerna;

public class MovelModernoFactory  implements MovelFactory{
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Mesa criaMesa() {
        return new MesaModerna();
    }
}
