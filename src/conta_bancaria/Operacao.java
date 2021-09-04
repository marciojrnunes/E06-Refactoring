package conta_bancaria;

public abstract class Operacao {

    private double valor;

    protected Operacao(double valor) {
        this.valor = valor;
    }

    public abstract String getTipo();

    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
