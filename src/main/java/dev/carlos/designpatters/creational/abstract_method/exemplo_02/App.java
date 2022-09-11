package dev.carlos.designpatters.creational.abstract_method.exemplo_02;

import dev.carlos.designpatters.creational.abstract_method.exemplo_02.factory.MovelFactory;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.factory.MovelModernoFactory;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.factory.MovelVintageFactory;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.factory.MovelVitorianoFactory;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.movel.Movel;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.movel.TipoMovel;

public class App {

    public static Movel montarMoveis(TipoMovel tipo){
        MovelFactory moveis = null;
        switch (tipo){
            case MODERNO -> moveis = new MovelModernoFactory();
            case VINTAGE ->  moveis = new MovelVintageFactory();
            case VITORIANO ->  moveis = new MovelVitorianoFactory();
            default -> throw new IllegalStateException("Valor inválido!");
        }
        return new Movel(moveis.criaMesa(), moveis.criarCadeira());
    }

    public static void main(String[] args) {
        Movel movelModerno = montarMoveis(TipoMovel.MODERNO);
        Movel movelVinatage = montarMoveis(TipoMovel.VINTAGE);
        Movel movelVitoriano = montarMoveis(TipoMovel.VITORIANO);
    }
}
