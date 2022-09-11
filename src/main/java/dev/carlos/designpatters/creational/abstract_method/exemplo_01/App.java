package dev.carlos.designpatters.creational.abstract_method.exemplo_01;

import dev.carlos.designpatters.creational.abstract_method.exemplo_01.carro.Carro;
import dev.carlos.designpatters.creational.abstract_method.exemplo_01.factory.CarroFactory;
import dev.carlos.designpatters.creational.abstract_method.exemplo_01.factory.CarroLuxoFactory;
import dev.carlos.designpatters.creational.abstract_method.exemplo_01.factory.CarroPopularFactory;

public class App {
    private static Carro montarCarro(String tipo){
        CarroFactory carroFc = null;
        switch (tipo){
            case "luxo" :
                    carroFc =  new CarroLuxoFactory();
                    break;
            case "popular" :
                carroFc = new CarroPopularFactory();
                break;
        }
        Carro carro = new Carro();
        carro.setRoda(carroFc.montarRoda());
        carro.setSom(carroFc.montarSom());

        return carro;
    }

    public static void main(String[] args) {
        Carro carroLuxo = montarCarro("luxo");
        Carro carroPopular = montarCarro("popular");
    }
}
