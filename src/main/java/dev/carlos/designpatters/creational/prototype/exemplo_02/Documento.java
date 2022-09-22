package dev.carlos.designpatters.creational.prototype.exemplo_02;

final class Documento implements Cloneable {

    String nome;
    String visibilidade;
    String tipo;
    String localizacao; // url, path, etc

    @Override
    public Documento clone() throws CloneNotSupportedException {
        return (Documento) super.clone();
    }

    @Override
    public String toString() {
        return "Documento [nome=" + nome + ", visibilidade=" + visibilidade + ", tipo=" + tipo + ", localizacao=" + localizacao
                + "]";
    }

}
