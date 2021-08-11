
public class Cliente {
	
	private String nome;
    private String cpf;
    private String telefone;
    
	public Cliente(String nome, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNomeCliente() {
		return nome;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nome = nomeCliente;
	}

	public String getCpfCliente() {
		return cpf;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpf = cpfCliente;
	}

	public String getTelefoneCliente() {
		return telefone;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefone = telefoneCliente;
	}

	@Override
	public String toString() {
		return String.format("CPF: %s\nNome: %s\nTelefone: %s", this.cpf, this.nome, this.telefone);
	}
	
	
}
