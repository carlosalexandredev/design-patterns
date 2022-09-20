package dev.carlos.designpatters.structural.adapter.Exemplo_05;


public class PessoaJuridica implements Pessoa{
    String cnpj;

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String retornaRegistro() {
        return cnpj;
    }
}
