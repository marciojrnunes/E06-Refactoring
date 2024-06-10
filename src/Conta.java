import java.util.ArrayList;
import java.util.List;

public class Conta {
    private Cliente cliente;
    private DadosConta dadosConta;
    private double saldo;
    private List<Operacao> operacoes;

    public Conta(Cliente novoCliente, DadosConta novosDados, double saldo) {
        this.cliente = novoCliente;
        this.dadosConta = novosDados;
        this.saldo = saldo;
        this.operacoes = new ArrayList<>();
    }

    public void depositar(double valor) {
        if (valor > 0.0) {
            this.saldo += valor;
            Operacao op = new OperacaoDeposito(valor);
            this.operacoes.add(op);
        }
    }
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            Operacao op = new OperacaoSaque(valor);
            this.operacoes.add(op);
        }
    }

    public String toString() {
        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }

        return "-----CLIENTE-----\n" +
                this.cliente.getDadosCliente() +
                "\n\n" +
                "-----CONTA-----\n" +
                this.dadosConta.getDadosConta() + "Saldo: " + this.saldo +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato +
                "\n";
    }
}
