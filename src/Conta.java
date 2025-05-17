import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numAgencia;
    private int numConta;
    private String gerente;
    private double saldoConta;
    private Cliente cliente;
    private List<Operacao> operacoes;

    public Conta(int numAgencia, int numConta, String gerente, double saldoConta, Cliente cliente) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.gerente = gerente;
        this.saldoConta = saldoConta;
        this.cliente = cliente;
        this.operacoes = new ArrayList<>();
    }

    public void realizarOperacao(char tipo, double valorOperacao) {
        if (valorOperacao <= 0) {
            throw new IllegalArgumentException("Valor da operação deve ser positivo");
        }

        if (tipo == 's' && valorOperacao > this.saldoConta) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        Operacao op = new Operacao(tipo, valorOperacao);
        this.operacoes.add(op);

        if (tipo == 'd') {
            this.saldoConta += valorOperacao;
        } else if (tipo == 's') {
            this.saldoConta -= valorOperacao;
        } else {
            throw new IllegalArgumentException("Tipo de operação inválido");
        }
    }

    public String toString() {
        return cliente.toString() + 
               String.format("-----CONTA-----\nAg.: %d\nConta: %d\nGerente: %s\nSaldo: %.2f\n\n",
               this.numAgencia, this.numConta, this.gerente, this.saldoConta);
    }

public String gerarExtrato() {
    StringBuilder extrato = new StringBuilder("-----EXTRATO-----");
    for (Operacao op : this.operacoes) {
        extrato.append("\n").append(op.toString()); 
    }
    return extrato.toString();
}
}