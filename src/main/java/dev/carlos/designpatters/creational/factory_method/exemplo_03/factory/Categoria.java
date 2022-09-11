package dev.carlos.designpatters.creational.factory_method.exemplo_03.factory;


import dev.carlos.designpatters.creational.factory_method.exemplo_03.produto.ProdutoDigital;
import dev.carlos.designpatters.creational.factory_method.exemplo_03.produto.ProdutoFisico;
import dev.carlos.designpatters.creational.factory_method.exemplo_03.produto.ProdutoPadrao;

public class Categoria {
    public ProdutoPadrao novoProduto(int tipoProduto) {
        switch (tipoProduto) {
            case 1:
                return new ProdutoPadrao();
            case 2:
                return new ProdutoDigital();
            case 3:
                return new ProdutoFisico();
            default:
                throw new IllegalArgumentException();
        }
    }
}
