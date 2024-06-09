public class Cliente {

    private String nomeCliente;
    private String cpfCliente;
    private String telefoneCliente;

    public Cliente(String nomeCliente, String cpfCliente, String telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
    } // construtor

    // getters e setters


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    @Override
    public String toString() {
        return String.format("CPF: %s\nnNome:  %s\nTelefone: %s", cpfCliente, nomeCliente, telefoneCliente);
    } // metodo toString



}
