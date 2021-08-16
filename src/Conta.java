import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Cliente cliente;
    private Banco banco;
    private int numConta;
    private double saldo;
    private List<Operacao> operacoes;
    
    public Conta(Cliente cliente, Banco banco, int numConta, double saldo) {
        this.cliente = cliente;
        this.banco = banco;
        this.numConta = numConta;
        this.saldo = saldo;
        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, 0, 0);
    }

    private void atualizarSaldo(Operacao op, double valor){
        if (op instanceof OpDeposito)
            this.saldo += valor;
        else if(op instanceof OpSaque)
            this.saldo -= valor;
    }

    private Operacao selecionarOperacao(char tipo, double valor){
        Operacao op = new OpDeposito();
        if (tipo == 'd'){
            op = new OpDeposito(tipo, valor);       
        }            
        else if(tipo == 's'){
            op = new OpSaque(tipo, valor);
        }
        return op;
    }

    public void realizarOperacao(char tipo, double valor) {      
        Operacao op = selecionarOperacao(tipo, valor);
        this.operacoes.add(op);
        atualizarSaldo(op, valor);
    }

    private String dadosConta(){
        return String.format("Conta: %d\nSaldo: %.2f", this.numConta, this.saldo); 
    }

    private String dadosExtrato(){
        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }
        return dadosExtrato;
    }

    public String toString() {
         return "-----CLIENTE-----\n" +
               cliente.toString() +
                "\n\n" +
                "-----CONTA-----\n" +
                banco.toString() + "\n" +
                dadosConta() +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato() +
                "\n";
    }
}
