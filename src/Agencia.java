public class Agencia {

    private int numAgencia;
    private String gerente;

    public Agencia(int numAgencia, String gerente){
        this.numAgencia = numAgencia;
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "\n-----AGENCIA-----\n" +
                "Número Agência: " + numAgencia +
                "\n" + "Gerente: " +  gerente;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
}
