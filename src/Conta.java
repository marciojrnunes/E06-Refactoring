import java.util.ArrayList;
import java.util.List;

public class Conta {

    // TODO(#1) REFATORAR: Esses dados deveriam ficar em outro lugar
    private Cliente cliente;

    // TODO(#1) REFATORAR: Esses dados deveriam ficar em outro lugar
    private Agencia agencia;
    private int numConta;

    // TODO(#2) REFATORAR: Esse nome não é o ideal para representar o saldo da conta
    private double saldo;

    private List<Operacao> operacoes;

    public Conta(Cliente cliente, Agencia agencia,  int numConta, double saldoInicial) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldoInicial;
        this.numConta = numConta;
        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, null, 0, 0, null, 0);
    }

    // TODO(#3) REFATORAR: Muita responsabilidade para o mesmo método
    public void realizarOperacao(char tipo, double valor) {
        if (tipo == 'd') {
            Operacao.depositar(this, valor);
        } else if (tipo == 's') {
            Operacao.sacar(this, valor);
        } else {
            System.out.println("Operação inválida");
            return;
        }
        Operacao op = new Operacao(tipo, valor);
        operacoes.add(op);
    }
    public String dadosConta() {
        return String.format("Conta: %d\nSaldo: %.2f",
                 numConta, saldo);
    }

    public String toString() {
        // TODO(#4) REFATORAR: Esses dados não estão relacionados a conta
        String dadosCliente = cliente.toString();

        // TODO(#4) REFATORAR: Esses dados não estão relacinados a conta
        String dadosConta = this.dadosConta();
        String dadosAgencia = agencia.dadosAgencia();

        // TODO(#5) REFATORAR: Essa operação não deveria estar sendo realizada neste método
        String dadosExtrato = Operacao.gerarExtrato(this.operacoes);

        return "-----CLIENTE-----\n" +
                dadosCliente +
                "\n\n" +
                "-----CONTA-----\n" +
                dadosConta + dadosAgencia +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato +
                "\n";
    }
}
