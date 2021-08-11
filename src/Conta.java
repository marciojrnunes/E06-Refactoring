import java.util.ArrayList;
import java.util.List;

public class Conta {

    Cliente cliente;
    Agencia agencia;

    private double saldo;

    private List<Operacao> operacoes;

    public Conta(Cliente cliente, Agencia agencia, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, 0);
    }

    public void realizarOperacao(Operacao op) {
        this.operacoes.add(op);

        if (op instanceof OperacaoDeposito)
            this.saldo += op.getValor();
        else if (op instanceof OperacaoSaque)
            this.saldo -= op.getValor();
    }

    public String toString() {
        String dadosCliente = this.cliente.toString();
        String dadosConta = this.agencia.toString() + String.format("\nSaldo: %.2f", this.saldo);

        return "-----CLIENTE-----\n" + dadosCliente + "\n\n" + "-----CONTA-----\n" + dadosConta + "\n\n"
                + "-----EXTRATO-----\n" + extrato() + "\n";
    }

    public String extrato() {
        String dadosExtrato = "";
        for (Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }
        return dadosExtrato;
    }
}
