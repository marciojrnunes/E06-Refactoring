public class Operacao {

    private char tipo;
    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        AccountType accountType = AccountType.fromCode("S");
        return accountType.toString();
    }

    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
