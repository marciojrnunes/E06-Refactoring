import java.util.ArrayList;
import java.util.List;

public class Conta {
    private Cliente cliente;
    private Agencia agencia;
    private int numConta;
    private double saldo;
    private List<Operacao> operacoes;

    public Conta(Cliente cliente, int numConta, Agencia agencia, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;

        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, 0, null, 0.0);
    }

    public void sacar (double valor) {
        OperacaoSaque op = new OperacaoSaque(valor);
        this.operacoes.add(op);

        if (valor < this.saldo){
            this.saldo -= valor;
        }
    }

    public void depositar (double valor) {
        OperacaoDeposito op = new OperacaoDeposito(valor);
        this.operacoes.add(op);

        if (valor > 0){
            this.saldo += valor;
        }
    }

    public String extrato() {

        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }

        return  "-----EXTRATO-----\n" + dadosExtrato + "\n";
    }

    public String toString() {
        String dadosCliente = this.cliente.toString();

        String dadosAgencia = this.agencia.toString();

        return "-----CLIENTE-----\n" +
                dadosCliente +
                "\n\n" +
                "-----CONTA-----\n" +
                dadosAgencia + String.format("Conta: %d\nSaldo: %.2f", this.numConta, this.saldo) +
                "\n\n" +
                this.extrato() +
                "\n";
    }
}
