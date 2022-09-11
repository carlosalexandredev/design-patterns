package dev.carlos.designpatters.creational.abstract_method.exemplo_02.factory;

import dev.carlos.designpatters.creational.abstract_method.exemplo_02.cadeira.Cadeira;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.mesa.Mesa;

public interface MovelFactory {
    Cadeira criarCadeira();
    Mesa criaMesa();
}
