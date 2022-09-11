package dev.carlos.designpatters.creational.factory_method.exemplo_03;


import dev.carlos.designpatters.creational.factory_method.exemplo_03.factory.Categoria;
import dev.carlos.designpatters.creational.factory_method.exemplo_03.produto.Produto;

public class App {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Produto produto = new Categoria().novoProduto(1);
    }

}

