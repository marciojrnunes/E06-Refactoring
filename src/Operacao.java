public class Operacao {

    public static final char DEPOSITO = 'd';
    public static final char SAQUE = 's';

    private char tipo;
    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    private String getTipoDescricao(char tipo) {
        if (tipo == DEPOSITO) {
            return "Depósito";
        } else if (tipo == SAQUE) {
            return "Saque";
        } else {
            return "Tipo inválido";
        }
    }

    public String getTipoDescricao() {
        return getTipoDescricao(tipo);
    }

    public String toString() {
        return getTipoDescricao() + ":\t" + valor;
    }
}
