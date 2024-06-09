
import java.util.ArrayList;
import java.util.List;

public class Conta {


    private final Cliente cliente;
    private final ContaBancaria contaBancaria;
    private double saldo;
    private final List<Operacao> operacoes;


    public Conta(Cliente cliente, ContaBancaria contaBancaria, double saldo) {

        this.cliente = cliente;
        this.contaBancaria = contaBancaria;
        this.saldo = saldo;
        this.operacoes = new ArrayList<>();

    }

    public Conta() {
        this(null, null, 0);
    }


    // Metodos para realizar as operacoes separadamente

    public void depositar(double valor) {
        if(valor > 0) {
            Operacao op = new Operacao('d', valor);
            this.operacoes.add(op);
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && this.saldo >= valor) {
            Operacao op = new Operacao('s', valor);
            this.operacoes.add(op);
            this.saldo -= valor;
        }
    }


    private String gerarExtrato() {
        StringBuilder dadosExtrato = new StringBuilder();
        for (Operacao op : this.operacoes) {
            dadosExtrato.append(op.toString()).append("\n");
        }
        return dadosExtrato.toString();
    }


    @Override
    public String toString() {
        String dadosCliente = cliente != null ? cliente.toString() : "Cliente não informado";
        String dadosContaBancaria = contaBancaria != null ? contaBancaria.toString() : "Conta Bancária não informada";
        String dadosExtrato = gerarExtrato();

        return dadosCliente +
                "\n\n" +
                dadosContaBancaria +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato +
                "\nSaldo: " + String.format("%.2f", saldo) + "\n";
    }
}
