import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Cliente cliente;
    private int numAgencia;
    private int numConta;
    private String gerente;

    
    private double saldo;

    private List<Operacao> operacoes;

    public Conta(String nomeCliente, String cpfCliente, String telefoneCliente, int numAgencia, int numConta, String gerente, double saldo) {
        this.cliente = new Cliente(nomeCliente, cpfCliente, telefoneCliente);
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.gerente = gerente;
        this.saldo  = saldo;

        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, null, 0, 0, null, 0);
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
    
    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Operacao> getOperacoes() {
        return operacoes;
    }
    

    public void realizarDeposito(double valor) {
        Operacao op = new Operacao('d', valor);
        this.operacoes.add(op);
        this.saldo += valor;
    }

    public void realizarSaque(double valor) {
        if (valor <= this.saldo) {
            Operacao op = new Operacao('s', valor);
            this.operacoes.add(op);
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
