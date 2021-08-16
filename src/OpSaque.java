public class OpSaque extends Operacao {

    public OpSaque(char tipo, double valor) {
        super(tipo, valor);
    }
    
    public String toString() {
        return "Saque:\t" + getValor();
    }
    
}
