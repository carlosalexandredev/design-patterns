package dev.carlos.designpatters.creational.factory_method.exemplo_04;

import dev.carlos.designpatters.creational.factory_method.exemplo_04.factory.PoligonoFactory;

public class App {
    public static void main(String[] args) {
        Poligono triangulo = PoligonoFactory.createPoligono(3);
        System.out.println(String.format("%s - %s", 3, triangulo.getDescription()));

        Poligono quadrado = PoligonoFactory.createPoligono(4);
        System.out.println(String.format("%s - %s", 4, quadrado.getDescription()));

        Poligono pentagono = PoligonoFactory.createPoligono(5);
        System.out.println(String.format("%s - %s", 5, pentagono.getDescription()));
    }
}
