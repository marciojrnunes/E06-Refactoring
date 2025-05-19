public class Main {


    public static void main(String[] args) {

        Cliente j = new Cliente("João", "111.111.111-11", "31 1111-1111");
        DadosConta c = new DadosConta( 111, 222222, "Gil", 0.00);
        Conta minhaConta = new Conta(j,c);

        minhaConta.realizarOperacao('d', 450);
        minhaConta.realizarOperacao('s', 50);
        minhaConta.realizarOperacao('s', 50);
        minhaConta.realizarOperacao('s', 50);

        System.out.println(minhaConta);
    }
}
