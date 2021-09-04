package conta_bancaria;


public class OperacaoSaque extends Operacao {

    public OperacaoSaque(double valor){
        super(valor);
    }
    
    @Override
    public String getTipo(){
        return "Saque";
    }
}
