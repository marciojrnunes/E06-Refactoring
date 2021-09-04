import ContaBancaria.*;

public class Main {


    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João", "111.111.111-11", "31 1111-1111");
        Agencia agencia1 = new Agencia(111, "Gil");

        Conta minhaConta = new Conta(cliente1, agencia1, 222222, 0.00);

        minhaConta.realizarOperacao('d', 450);
        minhaConta.realizarOperacao('s', 50);
        minhaConta.realizarOperacao('s', 50);
        minhaConta.realizarOperacao('s', 50);

        System.out.println(minhaConta);
    }
}
