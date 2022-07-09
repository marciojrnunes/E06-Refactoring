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
                return getDeposito();
            case 's':
                return getSaque();
            default:
                return null;
        }
    }

    public String toString() {
        return this.getTipo() + ":   " + this.valor;
    }
    
    public String getDeposito(){
        return "Depósito";
    }

    public String getSaque(){
        return "Saque";
    }
}
