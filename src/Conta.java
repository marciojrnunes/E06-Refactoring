import java.util.ArrayList;
import java.util.List;

public class Conta {


    private Cliente cliente;

    
    private int numAgencia;
    private int numConta;
    private String gerente;

    
    private double saldo;

    
    private Extrato extrato;

    
    public Conta(String nomeCliente, String cpfCliente, String telefoneCliente,
                 int numAgencia, int numConta, String gerente, double saldoInicial) {

        this.cliente = new Cliente(nomeCliente, cpfCliente, telefoneCliente);
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.gerente = gerente;
        this.saldo = saldoInicial;
        this.extrato = new Extrato();
    }

    public Conta() {
        this(null, null, null, 0, 0, null, 0);
    }

    public void realizarOperacao(char tipo, double valor) {
        Operacao op = new Operacao(tipo, valor);
        extrato.adicionarOperacao(op);

        if (tipo == 'd') {
            saldo += valor;
        } else if (tipo == 's') {
            saldo -= valor;
        }
    }

    @Override
    public String toString() {
        String dadosCliente = cliente.toString();
        String dadosConta = String.format("Ag.: %d\nConta: %d\nGerente: %s\nSaldo: %.2f",
                                         numAgencia, numConta, gerente, saldo);
        String dadosExtrato = extrato.toString();

        return "-----CLIENTE-----\n" +
               dadosCliente +
               "\n\n-----CONTA-----\n" +
               dadosConta +
               "\n\n-----EXTRATO-----\n" +
               dadosExtrato +
               "\n";
    }

    
    private class Cliente {
        private String nome;
        private String cpf;
        private String telefone;

        public Cliente(String nome, String cpf, String telefone) {
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
        }

        @Override
        public String toString() {
            return String.format("CPF: %s\nNome: %s\nTelefone: %s", cpf, nome, telefone);
        }
    }

    
    private class Extrato {
        private List<Operacao> operacoes;

        public Extrato() {
            operacoes = new ArrayList<>();
        }

        public void adicionarOperacao(Operacao op) {
            operacoes.add(op);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Operacao op : operacoes) {
                sb.append(op.toString()).append("\n");
            }
            return sb.toString();
        }
    }

    
    private class Operacao {
        private char tipo;
        private double valor;

        public Operacao(char tipo, double valor) {
            this.tipo = tipo;
            this.valor = valor;
        }

        public String getTipoExtenso() {
            switch (tipo) {
                case 'd': return "Depósito";
                case 's': return "Saque";
                default: return "Operação Desconhecida";
            }
        }

        @Override
        public String toString() {
            return getTipoExtenso() + ":\t" + valor;
        }
    }
}
