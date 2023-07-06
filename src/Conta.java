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

    public void depositar(double valor){

        OperacaoDeposito opDeposito = new OperacaoDeposito(valor);
        this.operacoes.add(opDeposito);

        if(valor > 0){
            this.saldo = saldo + valor;
        }
    }

    public void sacar(double valor){

        OperacaoSaque opSaque = new OperacaoSaque(valor);
        this.operacoes.add(opSaque);

        if(valor < this.saldo){
            this.saldo = saldo - valor;
        }
    }

    public String toString() {

        return "-----CONTA-----\n" + "Número Conta: " +
                        this.numConta + "\n" + "Saldo: " + String.format("%.2f ", this.saldo) + "\n" +
                        this.cliente.toString() + "\n" + this.agencia.toString() + "\n" +
                        this.imprimirExtrato();
    }

    public String imprimirExtrato() {

        String dadosExtrato = "";
        for (Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }

        return "\n-----EXTRATO-----\n" +
                dadosExtrato;
    }

}
