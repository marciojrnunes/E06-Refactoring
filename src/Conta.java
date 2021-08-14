import java.util.ArrayList;
import java.util.List;

public class Conta {

    private static int TOTAL_CONTAS = 0;

    private Agencia agencia;
    private Cliente cliente;
    private int numConta;
    private double saldo;
    private List<Operacao> operacoes;

    public Conta(Cliente cliente, Agencia agencia) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numConta = TOTAL_CONTAS + 1;
        this.saldo = 0.0;
        this.operacoes = new ArrayList<>();

        Conta.TOTAL_CONTAS++;
    }

    public Conta() {
        this(null, null);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.operacoes.add(new OperacaoDeposito(valor));
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.operacoes.add(new OperacaoSaque(valor));
            this.saldo -= valor;
        }
    }

    public String getExtrato() {
        StringBuilder extrato = new StringBuilder("====== Extrato da conta ======\n");
        for (Operacao atual : this.operacoes) {
            extrato.append(atual.toString()).append("\n");
        }
        return extrato.toString();
    }


    public String toString() {
        return "------- Dados da conta nº " + this.numConta + " ---------" + "\n" +
                "Saldo da conta: " + String.format("%.2f", this.saldo) + "\n" +
                this.agencia.toString() +
                this.cliente.toString() +
                this.getExtrato() +
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

    public void setOperacoes(List<Operacao> operacoes) {
        this.operacoes = operacoes;
    }
}
