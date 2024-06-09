public class Operacao {

    private char tipo;
    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }


    private static String typeToString(char tipo) {
        switch (tipo) {
            case 'd':
                return "Depósito";
            case 's':
                return "Saque";
            default:
                return "Desconhecido";
        }
    }

    public String toString() {
        return typeToString(this.tipo) + ":\t" + String.format("%.2f", this.valor);
    }
}
