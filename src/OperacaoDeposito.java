public class OperacaoDeposito extends Operacao {

    public OperacaoDeposito(double valor){
        super(valor);
        setTipo('d');
    }

    public String toString(){
        return "Depósito" + ":\t" + this.valor;
    }
}