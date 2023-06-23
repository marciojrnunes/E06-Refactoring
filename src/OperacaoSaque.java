public class OperacaoSaque extends Operacao {

    public OperacaoSaque(double valor){
        super(valor);
        setTipo('s');
    }

    public String toString(){
        return "Saque" + ":\t" + this.valor;
    }
}