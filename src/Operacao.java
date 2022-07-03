public abstract class Operacao {

    private char tipo;
    private double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return this.valor;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getTipo() {
        return this.tipo;
    }

    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
