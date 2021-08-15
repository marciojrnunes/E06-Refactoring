import java.util.ArrayList;
import java.util.List;

public class Conta {

    // TODO(#1) REFATORAR: Esses dados deveriam ficar em outro lugar OK
    private final Cliente cliente = new Cliente();

    // TODO(#1) REFATORAR: Esses dados deveriam ficar em outro lugar OK
    private final Agencia agencia = new Agencia();

    // TODO(#2) REFATORAR: Esse nome não é o ideal para representar o saldo da conta OK
    private double saldo;

    private List<Operacao> operacoes;

    public Conta(String nomeCliente, String cpfCliente, String telefoneCliente, int numAgencia, int numConta, String gerente, double saldo) {
        this.cliente.setNomeCliente(nomeCliente);
        this.cliente.setCpfCliente(cpfCliente);
        this.cliente.setTelefoneCliente(telefoneCliente);

        this.agencia.setNumAgencia(numAgencia);
        this.agencia.setNumConta(numConta);
        this.agencia.setGerente(gerente);
        this.saldo = saldo;

        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, null, 0, 0, null, 0);
    }

    // TODO(#3) REFATORAR: Muita responsabilidade para o mesmo método OK

    public void operacaoDeposito(int valor) {
        Operacao op = new OperacaoDeposito(valor);
        this.operacoes.add(op);

        this.saldo += valor;
    }

    public void operacaoSaque(int valor) {
        Operacao op = new OperacaoSaque(valor);
        this.operacoes.add(op);

        this.saldo -= valor;
    }

    public String getDadosExtrato() {
        String dadosExtrato = "";
        for (Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }
        return dadosExtrato;
    }

    public String toString() {
        // TODO(#4) REFATORAR: Esses dados não estão relacionados a conta OK
        String dadosCliente = cliente.toString();

        // TODO(#4) REFATORAR: Esses dados não estão relacinados a conta OK
        String dadosConta = agencia.toString() + String.format("\nSaldo: %.2f", this.saldo);

        // TODO(#5) REFATORAR: Essa operação não deveria estar sendo realizada neste método OK
        String dadosExtrato = getDadosExtrato();

        return "-----CLIENTE-----\n" +
                dadosCliente +
                "\n\n" +
                "-----CONTA-----\n" +
                dadosConta +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato +
                "\n";
    }

}
