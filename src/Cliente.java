public class Cliente {
    private String nomeCliente;
    private String cpfCliente;
    private String telefoneCliente;

    public Cliente(String nomeCliente, String cpfCliente, String telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public String toString() {
        return String.format("-----CLIENTE-----\nCPF: %s\nNome: %s\nTelefone: %s\n\n", 
               this.cpfCliente, this.nomeCliente, this.telefoneCliente);
    }
}
