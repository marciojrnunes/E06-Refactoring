public class OpDeposito extends Operacao {

    public OpDeposito(char tipo, double valor) {
        super(tipo, valor);
    }

    public OpDeposito() {
        super();
    }

    public String toString() {
        return "Depósito:\t" + getValor();
    }
}
