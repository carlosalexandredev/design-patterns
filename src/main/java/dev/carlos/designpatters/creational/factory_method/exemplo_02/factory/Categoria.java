package dev.carlos.designpatters.creational.factory_method.exemplo_02.factory;

import dev.carlos.designpatters.creational.factory_method.exemplo_02.produto.Produto;

public interface Categoria {
    Produto novoProduto();
}
