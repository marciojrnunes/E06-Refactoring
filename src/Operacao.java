public class Operacao {

    private char tipo;
    private double valor;

    public Operacao (double valor){
        this.valor = valor;
    }

    // TODO(#6) REFATORAR: Muita responsabilidade para mesma classe
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

    public double deposito(double valor){
        this.valor += valor;
        return valor;
    }
    public double saque(double valor){
        this.valor -= valor;
        return valor;
    }

    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
