package desafio.bancodigital;

public class Terminal {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();
        Conta c2 = new ContaCorrente();

        c1.extrato();
        c2.extrato();

        Conta c3 = new ContaPoupanca();
        Conta c4 = new ContaPoupanca();

        c3.extrato();
        c4.extrato();

        c1.depositar(30.0);
        c1.depositar(1200.50);
        c1.extrato();

        c1.transferir(50.0, c3);
        c1.extrato();
        c3.extrato();
    }
}
