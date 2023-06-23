public class OperacaoDeposito extends Operacao{

    public OperacaoDeposito(double valor) {
        super(valor);
        setTipo('d');
    }
}
