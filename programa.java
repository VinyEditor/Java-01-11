package Ex1;

public class programa {

    public static void main(String[] args) {
        contaCorrente cc = new contaCorrente();

        cc.setAgencia("0001");
        cc.setConta("14769");
        cc.setSaldo(100);
       
        cc.setChequeEspecial(500);
       
        System.out.printf("Conta Corrente: Ag: %s, Num: %s, Saldo: %.2f, Chq Esp: %.2f", cc.getAgencia(), cc.getConta(), cc.getSaldo(), cc.getChequeEspecial() );


        contaPoupança cp = new contaPoupança();

        cp.setAgencia("0002");
        cp.setConta("14769");
        cp.setSaldo(100);

        cp.setRentabilidade(0.5);

        System.out.printf("\n\n\nConta Poupança: Ag: %s, Num: %s, Saldo: %.2f, Rent: %.2f", cp.getAgencia(), cp.getConta(), cp.getSaldo(), cp.getRentabilidade() );

        contaSalario cs = new contaSalario();

        cs.setAgencia("0003");
        cs.getConta("14769");
        cs.setSaldo(100);

        cs.setPortabilidade("Sim");

        System.out.printf("\n\n\nConta Salário: Ag: %s, Num: %s, Saldo: %.2f, Portabilidade: %s", cs.getAgencia(), cs.getConta(), cs.getSaldo(), cs.getPortabilidade() );
        
    }


    
}
