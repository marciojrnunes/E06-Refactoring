public abstract class Operacao {

    private char tipo;
    private double valor;

    public Operacao(double valor){
        this.valor = valor;
    }

    public String toString() {
        return this.getTipo() + ":\t" + String.format("%.2f", this.getValor());
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
}
