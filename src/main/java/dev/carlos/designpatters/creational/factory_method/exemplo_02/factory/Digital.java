package dev.carlos.designpatters.creational.factory_method.exemplo_02.factory;

import dev.carlos.designpatters.creational.factory_method.exemplo_02.produto.Produto;
import dev.carlos.designpatters.creational.factory_method.exemplo_02.produto.ProdutoDigital;

public class Digital implements Categoria {
    @Override
    public Produto novoProduto() {
        return new ProdutoDigital();
    }
}
