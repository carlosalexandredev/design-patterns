package dev.carlos.designpatters.structural.adpter.Exemplo_05;

public class AppClient {
    public static void main(String[] args) {

        PessoaJuridica pj = new PessoaJuridica("90211394000110");
        pj.retornaRegistro();

        PessoaFisicaAdapter pf = new PessoaFisicaAdapter(new PessoaFisica("74729086066"));
        pf.retornaRegistro();
    }
}
