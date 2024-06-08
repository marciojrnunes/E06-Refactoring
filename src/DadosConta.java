public class DadosConta {
    private int numAgencia;
    private int numConta;
    private String gerente;
    private double saldo;

    public DadosConta(int numAgencia, int numConta, String gerente, double saldo) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.gerente = gerente;
        this.saldo = saldo;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getGerente() {
        return gerente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return String.format("Ag.: %d\nConta: %d\nGerente: %s\nSaldo: %.2f",
                numAgencia, numConta, gerente, saldo);
    }
}
