package dev.carlos.designpatters.creational.singleton.exemplo_03;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


public class InstitutoFederal{
    @Getter
    private String nome;
    @Getter
    private String endereco;
    @Getter
    private String telefone;

    @Getter
    @Setter
    public Integer quantidadeDocentes;
    @Getter
    @Setter
    public Integer quantidadeDiscentes;

    private static InstitutoFederal instituto;

    private InstitutoFederal() {
        this.nome = "Instituto Federal de Goiás";
        this.endereco = "R. São Bartolomeu, s/n - Vila Esperança, Luziânia - GO, 72811-580";
        this.telefone = "(61) 3251-4100";
    }

    public static InstitutoFederal getInstace(){
        if(Objects.isNull(instituto)){
            instituto = new InstitutoFederal();
        }
        return instituto;
    }

    @Override
    public String toString() {
        return String.format("""
               InstitutoFederal:
                   nome: %s,
                   endereco: %s,
                   telefone: %s,
                   quantidadeDocentes: %s,
                   quantidadeDiscentes: %s
               """, getNome(), getEndereco(), getTelefone(),
               getQuantidadeDocentes(), getQuantidadeDiscentes());
    }
}
