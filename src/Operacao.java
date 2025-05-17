public class Operacao {
    private char tipo;
    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

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

    public String toString() {
    return String.format("%-9s: %.2f", this.getTipo(), this.valor); 
}
}