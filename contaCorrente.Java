package Ex1;

public class contaCorrente  extends Conta{
    private double chequeEspecial;
    
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente() {
    }


    contaCorrente (String agencia, String conta, double saldo, double chequeEspecial) {
        super(agencia, conta, saldo);
        this.chequeEspecial = chequeEspecial;
    }


}