import java.util.ArrayList;
import java.util.List;

public class Conta {

    // TODO(#1) REFATORAR: Esses dados deveriam ficar em outro lugar
    Cliente cliente;

    // TODO(#1) REFATORAR: Esses dados deveriam ficar em outro lugar
    Agencia agencia;

    // TODO(#2) REFATORAR: Esse nome não é o ideal para representar o saldo da conta
    private double valor;

    private List<Operacao> operacoes;

    public Conta(Cliente cliente, Agencia agencia, double valor) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.valor = valor;
        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, 0);
    }

    // TODO(#3) REFATORAR: Muita responsabilidade para o mesmo método
    public void realizarOperacao(Operacao operacao) {
        this.operacoes.add(operacao);

        if (operacao instanceof OperacaoDeposito)
            this.valor += operacao.getValor();
        else if (operacao instanceof OperacaoSaque)
            this.valor -= operacao.getValor();
    }

    public String toString() {
        // TODO(#4) REFATORAR: Esses dados não estão relacionados a conta
        String dadosCliente = this.cliente.toString();

        // TODO(#4) REFATORAR: Esses dados não estão relacinados a conta
        String dadosConta = this.agencia.toString();

        // TODO(#5) REFATORAR: Essa operação não deveria estar sendo realizada neste método
        return "-----CLIENTE-----\n" +
                dadosCliente +
                "\n\n" +
                "-----CONTA-----\n" +
                dadosConta +
                "\n\n" +
                "-----EXTRATO-----\n" +
                extrato() ;
    }

    public String extrato() {
        String dadosExtrato = "";
        for(Operacao operacao : this.operacoes) {
            dadosExtrato += operacao.toString() + "\t";
        }

        return dadosExtrato;
    }}
