public class Agencia {

    private int numAgencia;
    private String gerente;

    public Agencia(int numAgencia, String gerente) {
        this.numAgencia = numAgencia;
        this.gerente = gerente;
    }

    public String toString() {
        return "Agência: " + this.getNumAgencia() + "\n" +
                "Gerente: " + this.getGerente() + "\n";
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }
}
