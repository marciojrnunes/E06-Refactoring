import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Cliente cliente;

    private Dados dados;


    public Conta(String nomeCliente, String cpfCliente, String telefoneCliente, int numAgencia, int numConta, String gerente, double saldo) {
        this.cliente.setNomeCliente(nomeCliente);
        this.cliente.setCpfCliente(cpfCliente);
        this.cliente.setTelefoneCliente(telefoneCliente);
        this.dados.setNumAgencia(numAgencia);
        this.dados.setNumConta(numConta);
        this.dados.setGerente(gerente);
        this.dados.setSaldo(saldo);

        this.dados.setOperacoes(new ArrayList<>());
    }

    public Conta() {
        this(null, null, null, 0, 0, null, 0);
    }

    public void realizarOperacao(char tipo, int valor) {
        dados.realizaOperacao(tipo, valor);
    }

    public String toString() {

        return "-----CLIENTE-----\n" +
                cliente.toString() +
                "\n\n" +
                "-----CONTA-----\n" +
                dados.toString() +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dados.extratoOperacoes() +
                "\n";
    }
}
