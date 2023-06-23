public abstract class Operacao {

    private char tipo;
    protected double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    public char getTipo() {
        return this.tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract String toString();
}
