package Ex1;

public class contaSalario extends Conta{
    public String portabilidade;

    public String getPortabilidade() {
        return portabilidade;
    }

    public void setPortabilidade(String portabilidade) {
        this.portabilidade = portabilidade;
    }

    public contaSalario() {
    }

    contaSalario (String agencia, String conta, double saldo, String portabilidade) {
        super(agencia, conta, saldo);
        this.portabilidade = portabilidade;
    }
    
}
