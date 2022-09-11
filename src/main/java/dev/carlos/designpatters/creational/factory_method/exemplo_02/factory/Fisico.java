package dev.carlos.designpatters.creational.factory_method.exemplo_02.factory;

import dev.carlos.designpatters.creational.factory_method.exemplo_02.produto.Produto;
import dev.carlos.designpatters.creational.factory_method.exemplo_02.produto.ProdutoFisico;

public class Fisico implements Categoria {
    @Override
    public Produto novoProduto() {
        return new ProdutoFisico();
    }
}
