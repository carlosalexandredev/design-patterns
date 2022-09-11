package dev.carlos.designpatters.creational.factory_method.exemplo_04.factory;

import dev.carlos.designpatters.creational.factory_method.exemplo_04.Pentagono;
import dev.carlos.designpatters.creational.factory_method.exemplo_04.Poligono;
import dev.carlos.designpatters.creational.factory_method.exemplo_04.Quadrado;
import dev.carlos.designpatters.creational.factory_method.exemplo_04.Triangulo;

public class PoligonoFactory {
    public static Poligono createPoligono(int numeroLados){
        switch (numeroLados) {
            case 3 : return new Triangulo();
            case 4 : return new Quadrado();
            case 5 : return new Pentagono();
            default : return null;
        }
    }
}
