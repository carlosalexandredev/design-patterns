package dev.carlos.designpatters.creational.singleton.exemplo_02;

class ConfiguracaoAplicacao {
    private static ConfiguracaoAplicacao instance;
    public String nomeAplicacao;
    public String versao;
    public String cor;

    protected ConfiguracaoAplicacao() {
        this.nomeAplicacao = "Singleton";
        this.versao = "1.0";
        this.cor = "Verde";
    }

    public ConfiguracaoAplicacao getInstance() {
        if (instance == null) {
            String configuracao = System.getProperty("class.configuracao");
            if (configuracao == "teste") {
                instance = new ConfiguracaoAplicacaoTeste();
            }
            instance = new ConfiguracaoAplicacao();
        }
        return instance;
    }

}
