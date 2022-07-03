import java.util.ArrayList;
import java.util.List;

public class Conta {
    
    private int numConta;
    private Agencia agencia;
    private Cliente cliente;
    private double saldo;

    private List<Operacao> operacoes;

    public Conta(Cliente cliente, int numConta, Agencia agencia, double valor) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = valor;

        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, 0, null, 0.0);
    }

    public void depositar (double valor) {
        OperacaoDeposito op = new OperacaoDeposito(valor);
        this.operacoes.add(op);

        if (valor > 0){
            this.saldo += valor;
        }
    }

    public void sacar (double valor) {
        OperacaoSaque op = new OperacaoSaque(valor);
        this.operacoes.add(op);
        
        if (valor < this.saldo){
            this.saldo -= valor;
        }
    }
    

    public String extrato() {

        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }

        return  "\n\n-----EXTRATO-----\n\n" + dadosExtrato + "\n";
    }

    public String toString() {
        return "------- DADOS DA CONTA --------\n\n" + "Numero da conta: " + this.numConta + "\n" + 
                "Saldo da conta:" + String.format(" %.2f", this.saldo) + "\n" +
                this.agencia.toString() +
                this.cliente.toString() +
                this.extrato() +
                "------------------------------------\n";
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Operacao> getOperacoes() {
        return operacoes;
    }
}
