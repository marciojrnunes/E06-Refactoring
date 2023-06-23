public class Main {


    public static void main(String[] args) {

        Conta minhaConta = new Conta(new Cliente("Robert", "111.111.111-11", "31-99999-9999"),
                                     new Agencia(111, 12345, "Thomas"), 0.0);

        minhaConta.realizarOperacao(new OpecaraoDeposito(450));
        minhaConta.realizarOperacao(new OperacaoSaque(50));
        minhaConta.realizarOperacao(new OperacaoSaque(50));
        minhaConta.realizarOperacao(new OperacaoSaque(50));

        System.out.println(minhaConta);
    }
}
