public class Agencia {
    private int numAgencia;
    private int numConta;
    private String gerente;

    public Agencia (int numeroAgencia, int numConta,String gerente){
        this.numAgencia = numeroAgencia;
        this.numConta = numConta;
        this.gerente = gerente;
    }

    public Agencia(){
        this.numAgencia = 0;
        this.numConta = 0;
        this.gerente = null;

    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getGerente() {
        return gerente;
    }
    String dadosAgencia(){
        return String.format("Ag.: %d\nConta: %d\nGerente: %s\n",
                this.numAgencia, this.numConta, this.gerente);

    }
}
