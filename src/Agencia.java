
public class Agencia {
	
	private int numAgencia;
    private int numConta;
    private String gerente;
    
    
	public Agencia(int numAgencia, int numConta, String gerente) {
		super();
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


	@Override
	public String toString() {
		return String.format("Ag.: %d\nConta: %d\nGerente: ", this.numAgencia, this.numConta, this.gerente);
	}
	
	
}
