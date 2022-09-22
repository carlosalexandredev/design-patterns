package dev.carlos.designpatters.creational.prototype.exemplo_02;


import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("Objeto Original: ");
        Documento d = new Documento();
        d.nome = "ListaDeMembros.pdf";
        d.tipo = "PDF";
        d.visibilidade = "restrito";
        d.localizacao = "arquivos.sistema:1234/p1o39d8a.pdf";
        System.out.println(d);

        System.out.println("Objeto Clone: ");
        Documento d2 = d.clone();
        System.out.println(d2);

        System.out.println("-".repeat(100));

        System.out.println("Original: ");
        System.out.println(d);

        System.out.println("Clone alterado:");
        d2.nome = "Lista2.pdf";
        d2.tipo = "HTML";
        System.out.println(d2);
    }
}
