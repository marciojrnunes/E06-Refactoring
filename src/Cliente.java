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
        return String.format("CPF: %s\nNome: %s\nTelefone: %s\n",
                this.cpfCliente, this.nomeCliente, this.telefoneCliente);

    }

    public String getnomeCliente() {
        return nomeCliente;
    }

    public void setnomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getcpfCliente() {
        return cpfCliente;
    }

    public void setcpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String gettelefoneCliente() {
        return telefoneCliente;
    }

    public void settelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }


}
