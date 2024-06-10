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

    @Override
    public String toString() {
        return getTipo() + ":\t" + this.valor;
    }
}