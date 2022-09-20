package dev.carlos.designpatters.structural.adapter.Exemplo_05;

import lombok.Data;

@Data
public class PessoaFisicaAdapter implements Pessoa{


    PessoaFisica pessoaFisica;

    public PessoaFisicaAdapter(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    @Override
    public String retornaRegistro() {
        return this.pessoaFisica.retornaRegistroPessoaFisica();
    }
}
