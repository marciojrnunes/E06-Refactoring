public class Operacao {

    private char tipo;
    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        String tipoStr;
        switch (tipo) {
            case 'd':
                tipoStr = "Depósito";
                break;
            case 's':
                tipoStr = "Saque";
                break;
            default:
                tipoStr = "Operação desconhecida";
        }

        return String.format("%s:\t%.2f", tipoStr, valor);
    }
}
