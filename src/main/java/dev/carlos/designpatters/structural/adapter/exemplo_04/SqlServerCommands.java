package dev.carlos.designpatters.structural.adapter.exemplo_04;

import dev.carlos.designpatters.structural.adapter.exemplo_04.Entity.Historico;
import lombok.NonNull;

public class SqlServerCommands{

    public void saveSqlServer(@NonNull Historico historico) {
        System.out.println("Historico salvo em DB SqlServer...");
    }

    public void deleteSqlServer(@NonNull Historico historico) {
        System.out.println("Historico deletado em DB SqlServer...");

    }

    public Historico updateSqlServer(@NonNull Historico historico) {
        System.out.println("Historico atualizado em DB SqlServer...");
        return null;
    }


}
