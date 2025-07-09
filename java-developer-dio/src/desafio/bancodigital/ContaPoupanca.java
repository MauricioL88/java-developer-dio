package desafio.bancodigital;

public class ContaPoupanca extends Conta {
    @Override
    public void extrato() {
        System.out.println("*--------------------*");
        System.out.println("\tConta Poupança");
        super.detalheConta();
    }
}
