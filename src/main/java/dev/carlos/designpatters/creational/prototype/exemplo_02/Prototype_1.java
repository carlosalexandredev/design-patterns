package dev.carlos.designpatters.creational.prototype.exemplo_02;


public class Prototype_1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Documento1 d = new Documento1();
        d.nome = "ListaDeMembros.pdf";
        d.tipo = "PDF";
        d.visibilidade = "restrito";
        d.localizacao = "arquivos.sistema:1234/p1o39d8a.pdf";
        System.out.println(d);

        System.out.println("---");

        Documento1 d2 = d.clone();
        System.out.println(d2);

        System.out.println("---");

        d2.nome = "Lista2.pdf";
        System.out.println(d);
        System.out.println(d2);
    }
}
