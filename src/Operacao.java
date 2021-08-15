public abstract class Operacao {

    private char tipo;
    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    // TODO(#6) REFATORAR: Muita responsabilidade para mesma classe OK
    public abstract String getTipo();

    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
