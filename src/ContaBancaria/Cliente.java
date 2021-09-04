package ContaBancaria;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;           
    }
    public String getCpf(){
        return this.cpf;       
    }
    public String getTelefone(){
        return this.telefone;    
    }

    public String toString(){
        String dadosCliente = String.format("CPF: %s\nNome: %s\nTelefone: %s",
        this.cpf, this.nome, this.telefone);
        return dadosCliente;
    }
}
