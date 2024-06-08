public class Cliente {
    private String nomeCliente;
    private String cpfCliente;
    private String telefoneCliente;

    public Cliente(String nomeCliente, String cpfCliente, String telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
    }

    @Override
    public String toString() {
        return String.format("CPF: %s\nNome: %s\nTelefone: %s", cpfCliente, nomeCliente, telefoneCliente);
    }
}