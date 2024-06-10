import java.util.List;

public class Operacao {
    private char tipo;
    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        switch (this.tipo) {
            case 'd':
                return "Depósito";
            case 's':
                return "Saque";
            default:
                return null;
        }
    }

    public static void depositar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public static void sacar(Conta conta, double valor) {
        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
    }

    public static String gerarExtrato(List<Operacao> operacoes) {
        StringBuilder extrato = new StringBuilder();
        for (Operacao op : operacoes) {
            extrato.append(op.toString()).append("\n");
        }
        return extrato.toString();
    }

    @Override
    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}

