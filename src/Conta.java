import java.util.ArrayList;
import java.util.List;

public class Conta {
    private Cliente cliente;
    private Agencia agencia;
    private int numConta;
    private double saldo;
    private List<Operacao> operacoes;

    public Conta(Cliente cliente, Agencia agencia, int numConta, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, 0, 0.00);
    }

    public void realizarOperacao(char tipo, double valor) {
        Operacao op = new Operacao(tipo, valor);
        this.operacoes.add(op);

        if (tipo == 'd') {
            this.saldo += valor;
        } else if (tipo == 's') {
            this.saldo -= valor;
        }
    }

    @Override
    public String toString() {
        StringBuilder dadosExtrato = new StringBuilder();
        for (Operacao op : this.operacoes) {
            dadosExtrato.append(op.toString()).append("\n");
        }

        return "-----CLIENTE-----\n" +
                cliente.toString() +
                "\n\n" +
                "-----CONTA-----\n" +
                agencia.toString() +
                "\nConta: %d\nSaldo: %.2f\n" + this.numConta + this.saldo +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato.toString();
    }
}