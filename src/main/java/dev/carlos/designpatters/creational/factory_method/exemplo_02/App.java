package dev.carlos.designpatters.creational.factory_method.exemplo_02;

import dev.carlos.designpatters.creational.factory_method.exemplo_02.factory.Categoria;
import dev.carlos.designpatters.creational.factory_method.exemplo_02.factory.Fisico;
import dev.carlos.designpatters.creational.factory_method.exemplo_02.produto.Produto;

/**
 * Java Design Patterns - Factory Method(Virtual Constructor)
 *
 * @author Carlos Alexandre
 * @LinkedIn <a href="https://www.linkedin.com/in/carlosalexandredev/">carlosalexandredev</a>
 *
 * */

public class App {
    public static void main( String[] args ) {
        Categoria categoria = new Fisico();
        Produto produto = categoria.novoProduto();
        System.out.println(produto.cor());
    }
}
