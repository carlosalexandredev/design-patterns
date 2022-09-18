package dev.carlos.designpatters.creational.prototype.exemplo_02;

final class Documento1 implements Cloneable {

    String nome;
    String visibilidade;
    String tipo;
    String localizacao; // url, path, etc

    @Override
    public Documento1 clone() throws CloneNotSupportedException {
        return (Documento1) super.clone();
    }

    @Override
    public String toString() {
        return "Documento1 [nome=" + nome + ", visibilidade=" + visibilidade + ", tipo=" + tipo + ", localizacao=" + localizacao
                + "]";
    }

}
