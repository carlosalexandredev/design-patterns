package dev.carlos.designpatters.structural.adpter.exemplo_04;

import dev.carlos.designpatters.structural.adpter.exemplo_04.Entity.Historico;
import lombok.NonNull;

import java.util.List;

public class SqlServerAdpter implements DbAdapter<Historico>{

    SqlServerCommands sqlServer;

    public SqlServerAdpter(SqlServerCommands sqlServer) {
        this.sqlServer = sqlServer;
    }

    @Override
    public void save(@NonNull Historico historico) {
        this.sqlServer.saveSqlServer(historico);
    }

    @Override
    public void delete(@NonNull Historico historico) {
        this.sqlServer.deleteSqlServer(historico);
    }

    @Override
    public Historico update(@NonNull Historico historico) {
        this.sqlServer.updateSqlServer(historico);
        return null;
    }

    @Override
    public Historico finById(@NonNull Number id) {
        System.out.println("Registro retornado Historico em DB SqlServer...");
        return null;
    }

    @Override
    public List<Historico> findAll() {
        System.out.println("Lista de registros retornada Historico em DB SqlServer...");
        return null;
    }
}
