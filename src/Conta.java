import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numConta;
    private double saldo;
    private Agencia agencia;
    private Cliente cliente;

    private List<Operacao> operacoes;

    public Conta( Cliente cliente, int numConta, Agencia agencia, double valor) {

        this.cliente = cliente;
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = valor;

        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, 0, null, 0);
    }


    public void sacar(double valor){
        OperacaoSaque operacaoSaque = new OperacaoSaque(valor);
        this.operacoes.add(operacaoSaque);
        if(valor < this.saldo){
            this.saldo -= valor;
        }
    }

    public void depositar(double valor){
        OperacaoDeposito operacaoDeposito = new OperacaoDeposito(valor);
        this.operacoes.add(operacaoDeposito);

        if(valor > 0){
            this.saldo += valor;
        }
    }

    public String extrato(){
        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }
        return "-----EXTRATO-----\n" + dadosExtrato + "\n";
    }

    public String toString() {
        return "------- DADOS DA CONTA --------\n\n" + "Numero da conta: " + this.numConta + "\n" +
                "Saldo da conta:" + String.format(" %.2f", this.saldo) + "\n" +
                this.agencia.toString() +
                this.cliente.toString() +
                this.extrato() +
                "------------------------------------\n";
    }
}
