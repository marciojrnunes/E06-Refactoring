package conta_bancaria;

public class OperacaoDeposito extends Operacao{

    public OperacaoDeposito(double valor){
        super(valor);
    }

    @Override
    public String getTipo(){
        return "Depósito";
    }
    
}
