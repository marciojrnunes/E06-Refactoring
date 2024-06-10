public class Agencia {
    private int numAgencia;
    private String gerente;

    public Agencia(int numAgencia, String gerente) {
        this.numAgencia = numAgencia;
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "\nGerente: %s" + this.numAgencia + this.gerente;
    }
}