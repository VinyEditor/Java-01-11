package Ex1;

public class contaPoupança extends Conta {
    private double rentabilidade;

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public contaPoupança() {
    }
    
    contaPoupança (String agencia, String conta, double saldo, double rentabilidade) {
        super(agencia, conta, saldo);
        this.rentabilidade = rentabilidade;
    }
    
}
