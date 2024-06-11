public class Operacao {

    private char tipo;
    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    //criar operação de deposito
    public void depositar(Conta conta, double valor){
        conta.setSaldo(conta.getSaldo() + this.valor);
    }

    //criar operação de saque
    public void sacar(Conta conta, double valor){
        conta.setSaldo(conta.getSaldo() - this.valor);
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor(){
        return valor;
    }    

    @Override
    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
