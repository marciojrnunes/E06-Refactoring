import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Agencia agencia;
    private Cliente cliente;
    private int numeroConta;
    private double saldo;
    private List<Operacao> operacoes;

    public Conta(Agencia agencia, Cliente cliente, int numeroConta, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;

        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, 0, 0.0);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            OperacaoDeposito deposito = new OperacaoDeposito(valor);
            this.operacoes.add(deposito);
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            OperacaoSaque saque = new OperacaoSaque(valor);
            this.operacoes.add(saque);
            this.saldo -= valor;
        }
    }

    public String extrato() {
        String extrato = "--- Extrato ---\n";
        for (Operacao operacao : this.operacoes) {
            extrato += operacao.toString() + "\n";
        }
        return extrato;
    }


    public String toString() {
        return "--- Conta ---" + "\n" +
                "Número da conta: " + this.numeroConta  + "\n" +
                "Saldo da conta: " + String.format("%.2f", this.saldo) + "\n" +
                "--- Agencia ---" + "\n" +
                this.agencia.toString() +
                "--- Cliente ---" + "\n" +
                this.cliente.toString() +
                "--- Extrato ---" + "\n" +
                this.extrato();
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

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
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
