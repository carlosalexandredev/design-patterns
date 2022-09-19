package dev.carlos.designpatters.structural.adpter.Exemplo_05;

public class PessoaFisica{
    String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public String retornaRegistroPessoaFisica() {
        return cpf;
    }
}
