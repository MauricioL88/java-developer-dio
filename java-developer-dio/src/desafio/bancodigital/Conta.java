package desafio.bancodigital;

public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;

    private final String agencia = "0001";
    private int numero;
    private double saldo;

    public Conta() {
        this.numero = SEQUENCIAL++;
        this.saldo = 0.0;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor >= 1.0 && this.saldo >= 0) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo ou Valor de saque insuficiente!");
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor >= 1.0) {
            this.saldo += valor;
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(this.sacar(valor)) {
            contaDestino.depositar(valor);
        }
    }

    protected void detalheConta() {
        System.out.println("\tAgência: "+this.agencia);
        System.out.println("\tConta: "+this.numero);
        System.out.printf("\tSaldo: R$ %.2f%n", this.saldo);
        System.out.println("*--------------------*\n");
    }
}
