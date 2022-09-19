package dev.carlos.designpatters.structural.adpter.exemplo_04;

import dev.carlos.designpatters.structural.adpter.exemplo_04.Entity.Historico;

public class AppClient {
    public static void main(String[] args) {
        Historico historico = new Historico();

        OracleCommands oracle = new OracleCommands();
        oracle.save(historico);

        MySQLCommands mySQL = new MySQLCommands();
        mySQL.save(historico);

        //Adpter
        SqlServerAdpter sqlServer = new SqlServerAdpter(new SqlServerCommands());
        sqlServer.save(historico);
        sqlServer.findAll();
    }
}
