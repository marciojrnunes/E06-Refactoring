public class Main {


    public static void main(String[] args) {

        Conta minhaConta = new Conta("João", "111.111.111-11", "31 1111-1111",
                            111, 222222, "Gil", 0.00);

        minhaConta.realizarDeposito(450);
        minhaConta.realizarSaque(50);
        minhaConta.realizarSaque(50);
        minhaConta.realizarSaque(50);
        

        Extrato extrato = new Extrato(minhaConta.getCliente(), minhaConta, minhaConta.getOperacoes());
        extrato.gerarExtrato();
    
    }
}
