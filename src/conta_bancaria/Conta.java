package conta_bancaria;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private int numConta;
    Cliente donoConta;
    Agencia agenciaConta;
    private double saldoConta;
    private List<Operacao> operacoes;

    public Conta(Cliente dono, Agencia agencia, int numConta, double saldo) {
        this.donoConta = dono;
        this.agenciaConta = agencia;
        this.numConta = numConta;
        this.saldoConta = saldo;
        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this.agenciaConta = null;
        this.donoConta = null;
        this.numConta = 0;
        this.saldoConta = 0.0;
        this.operacoes = null;
    }

    public double getSaldo(){
        return this.saldoConta;
    }

    public List<Operacao> getOperacoes(){
        return this.operacoes;
    }

    public void depositar(double valor){
        OperacaoDeposito op = new OperacaoDeposito(valor);
        this.saldoConta += valor;
        this.operacoes.add(op);
    }

    public void sacar(double valor){
        OperacaoSaque op = new OperacaoSaque(valor);
        this.saldoConta -= valor;
        this.operacoes.add(op);
    }

    public void realizarOperacao(char tipo, int valor) {
        if (tipo == 'd')
            depositar(valor);
        else if(tipo == 's')
            sacar(valor);
    }

    public String extratoConta(){
        String extrato = "";
        for(Operacao op : this.operacoes) {
            extrato += op.toString() + "\n";
        }
        return extrato;
    }

    public String toString() {

        String dadosConta = String.format("Conta: %d %nSaldo: %.2f",
                this.numConta, this.saldoConta);
        
        String dadosExtrato = extratoConta();
        
        return "-----CLIENTE-----\n" +
                donoConta +
                "\n\n" +
                "-----CONTA-----\n" +
                this.agenciaConta + 
                dadosConta +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato +
                "\n";
    }
}
