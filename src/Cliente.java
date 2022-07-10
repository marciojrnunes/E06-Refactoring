public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

     public Cliente (String nomeCliente, String cpfCliente, String telefoneCliente){
        this.nome = nomeCliente;
        this.cpf = cpfCliente;
        this.telefone = telefoneCliente;
    }

    public Cliente(){
         this.nome = null;
         this.cpf = null;
         this.telefone = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    String dadosCliente(){
         return String.format("CPF: %s\nNome: %s\nTelefone: %s",
                this.cpf, this.nome, this.telefone);

    }
}
