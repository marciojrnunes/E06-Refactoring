public class DadosConta {
    private int numAgencia;
    private int numConta;
    private String gerente;
    private double saldoConta;

    public DadosConta(int numAgencia, int numConta, String gerente, double saldoConta) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.gerente = gerente;
        this.saldoConta = saldoConta;
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

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    @Override
    public String toString() {
        String dadosConta = String.format("Ag.: %d\nConta: %d\nGerente: %s\nSaldo: %.2f",
                this.numAgencia, this.numConta, this.gerente, this.saldoConta);
        return dadosConta;
    }

}
