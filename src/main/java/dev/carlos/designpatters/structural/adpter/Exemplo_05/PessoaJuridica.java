package dev.carlos.designpatters.structural.adpter.Exemplo_05;

import lombok.Data;


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
