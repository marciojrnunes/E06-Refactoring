public abstract class Operacao {

    private char tipo;
    private double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public char getTipo() {
        return tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
