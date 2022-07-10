import java.util.ArrayList;
import java.util.List;

public class Conta {

    // TODO(#1) REFATORAR: Esses dados deveriam ficar em outro lugar
    Cliente cliente = new Cliente();
    // TODO(#1) REFATORAR: Esses dados deveriam ficar em outro lugar
    Agencia agencia= new Agencia();

    // TODO(#2) REFATORAR: Esse nome não é o ideal para representar o saldo da conta
    private double saldo;

    private List<Operacao> operacoes;

    public Conta(String nomeCliente, String cpfCliente, String telefoneCliente, int numAgencia, int numConta, String gerente, double saldo) {
        cliente.setNome(nomeCliente);
        cliente.setCpf(cpfCliente);
        cliente.setCpf(cpfCliente);
        cliente.setTelefone(telefoneCliente);
        agencia.setNumAgencia(numAgencia);
        agencia.setNumConta(numConta);
        agencia.setGerente(gerente);
        this.saldo = saldo;
        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, null, 0, 0, null, 0);
    }

    // TODO(#3) REFATORAR: Muita responsabilidade para o mesmo método

        public void sacar(int valor){
            Operacao op =  new Operacao(valor);
            this.operacoes.add(op);
            op.setTipo('s');
            this.saldo -= valor;
        }

        public void depositar(int valor){
            Operacao op =  new Operacao(valor);
            this.operacoes.add(op);
            op.setTipo('d');
            this.saldo += valor;

         }

    public String toString() {
        // TODO(#4) REFATORAR: Esses dados não estão relacionados a conta

        // TODO(#4) REFATORAR: Esses dados não estão relacinados a conta

        // TODO(#5) REFATORAR: Essa operação não deveria estar sendo realizada neste método
        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }

        return "-----CLIENTE-----\n" +
               this.cliente.dadosCliente() +
                "\n\n" +
                "-----CONTA-----\n" +
                this.agencia.dadosAgencia() + "saldo: "+this.saldo+
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato +
                "\n";
    }
}
