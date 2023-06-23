public class Operacao {

    private double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    // TODO(#6) REFATORAR: Muita responsabilidade para mesma classe
    public String getTipo() {
        if (this instanceof OpecaraoDeposito) {
            return "d";
        } else if (this instanceof OperacaoSaque) {
            return "s";
        } else {
            return null;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
