package desafio.bancodigital;

public class ContaCorrente extends Conta {
    @Override
    public void extrato() {
        System.out.println("*--------------------*");
        System.out.println("\tConta Corrente");
        super.detalheConta();
    }
}
