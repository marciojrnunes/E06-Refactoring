public class Banco {
    private int numAgencia;
    private int numConta;
    private String gerente;

	public Banco(int numAgencia, int numConta, String gerente) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.gerente = gerente;
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
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

    public String toString(){
        String dadosConta = String.format("Ag.: %d\nConta: %d\nGerente: %s\n",
                this.numAgencia, this.numConta, this.gerente);
        return dadosConta;
    }
}
