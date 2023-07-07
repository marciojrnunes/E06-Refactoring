public class Operacao {

    private char tipo;
    private double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    // TODO(#6) REFATORAR: Muita responsabilidade para mesma classe
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
