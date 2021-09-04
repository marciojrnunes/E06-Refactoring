package ContaBancaria;


public class OperacaoSaque extends Operacao {

    public OperacaoSaque(double valor){
        super('s', valor);
    }
    
    @Override
    public String getTipo(){
        return "Saque";
    }
}
