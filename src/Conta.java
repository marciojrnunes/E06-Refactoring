class Cliente {
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

class Agencia {
    private int numAgencia;
    private int numConta;
    private String gerente;

    public Agencia(int numAgencia, int numConta, String gerente) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return String.format("Ag.: %d\nConta: %d\nGerente: %s", numAgencia, numConta, gerente);
    }
}

class Operacao {
    private char tipo;
    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %c, Valor: %.2f", tipo, valor);
    }
}

public class Conta {
    private Cliente cliente;
    private Agencia agencia;
    private double saldo;
    private List<Operacao> operacoes;

    public Conta(Cliente cliente, Agencia agencia, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, 0);
    }

    public void depositar(double valor) {
        realizarOperacao('d', valor);
    }

    public void sacar(double valor) {
        realizarOperacao('s', valor);
    }

    private void realizarOperacao(char tipo, double valor) {
        Operacao op = new Operacao(tipo, valor);
        operacoes.add(op);

        if (tipo == 'd') {
            saldo += valor;
        } else if (tipo == 's') {
            saldo -= valor;
        }
    }

    private String gerarExtrato() {
        StringBuilder dadosExtrato = new StringBuilder();
        for (Operacao op : operacoes) {
            dadosExtrato.append(op.toString()).append("\n");
        }
        return dadosExtrato.toString();
    }

    @Override
    public String toString() {
        return "-----CLIENTE-----\n" +
                cliente +
                "\n\n" +
                "-----CONTA-----\n" +
                agencia +
                "\nSaldo: " + String.format("%.2f", saldo) +
                "\n\n" +
                "-----EXTRATO-----\n" +
                gerarExtrato() +
                "\n";
    }
}