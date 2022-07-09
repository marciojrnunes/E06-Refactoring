import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Cliente cliente;

    private Banco banco;

    private double saldoAtual;

    private List<Operacao> operacoes;

    public Conta(Cliente cliente, Banco banco, double valor) {
        this.cliente = cliente;
        this.banco = banco;
        this.saldoAtual = valor;

        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, 0);
    }

    // TODO(#3) REFATORAR: Muita responsabilidade para o mesmo método
    public void realizarOperacao(char tipo, int valor) {
        Operacao op = new Operacao(tipo, valor);
        this.operacoes.add(op);

        if (tipo == 'd')
            realizarDeposito(valor);
        else if(tipo == 's')
            realizarSaque(valor);
    }

    public void realizarDeposito(int valor){
        this.saldoAtual += valor;
    }

    public void realizarSaque(int valor){
        if(saldoAtual >= valor)
            this.saldoAtual -= valor;
    }

    public String toString() {
        return "-----CLIENTE-----\n" +
                cliente.toString() +
                "\n\n" +
                "-----CONTA-----\n" +
                banco.toString() + 
                "Saldo: " +  this.saldoAtual + "\n" +
                "\n\n" +
                "-----EXTRATO-----\n" +
                operacoesToString() +
                "\n";
    }

    public String operacoesToString(){
        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }
        return dadosExtrato;
    }
}
