public class Main {

    public static void main(String[] args) {

        Conta minhaConta = new Conta(new Cliente("João", "111.111.111-11", "31 1111-1111"),
                new Agencia(111, 222222, "Gil"), 0.00);

        minhaConta.realizarOperacao(new OperacaoDeposito(450));
        minhaConta.realizarOperacao(new OperacaoSaque(50));
        minhaConta.realizarOperacao(new OperacaoSaque(50));
        minhaConta.realizarOperacao(new OperacaoSaque(50));

        System.out.println(minhaConta);
    }
}
