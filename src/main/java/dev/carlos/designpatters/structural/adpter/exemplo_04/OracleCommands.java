package dev.carlos.designpatters.structural.adpter.exemplo_04;

import dev.carlos.designpatters.structural.adpter.exemplo_04.Entity.Historico;
import lombok.NonNull;

import java.util.List;

public class OracleCommands implements DbAdapter<Historico>{

    @Override
    public void save(@NonNull Historico historico) {
        System.out.println("Historico salvo em DB Oracle...");
    }

    @Override
    public void delete(@NonNull Historico historico) {
        System.out.println("Historico deletado em DB Oracle...");

    }

    @Override
    public Historico update(@NonNull Historico historico) {
        System.out.println("Historico atualizado em DB Oracle...");
        return null;
    }

    @Override
    public Historico finById(@NonNull Number id) {
        System.out.println("Registro retornado Historico em DB Oracle...");
        return null;
    }

    @Override
    public List<Historico> findAll() {
        System.out.println("Lista de registros retornada Historico em DB Oracle...");
        return null;
    }
}
