public class Banco {

    private int numAgencia;
    private String gerente;


    public Banco(int numAgencia, String gerente) {
        this.numAgencia = numAgencia;
        this.gerente = gerente;
    }

    public int getNumAgencia() {
        return this.numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public String getGerente() {
        return this.gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    } 
    
    public String toString() {
        return String.format("Ag.: %d\nGerente: %s", this.numAgencia, this.gerente);
    }
}
