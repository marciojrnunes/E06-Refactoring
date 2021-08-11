public class Operacao {

    private double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        if (this instanceof OperacaoDeposito)
            return "d";
        else if (this instanceof OperacaoSaque)
            return "s";
        else
            return null;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
