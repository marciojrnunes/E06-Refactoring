public class Main {


    public static void main(String[] args) {

        Cliente cliente = new Cliente("Teste", "111.222.333-44", "31 8002-8922");
        ContaBancaria contaBancaria = new ContaBancaria(111, 33333, "André");
        Conta minhaConta = new Conta(cliente, contaBancaria, 0.00);


        minhaConta.depositar( 100);
        minhaConta.sacar(50);
        minhaConta.depositar(250);
        minhaConta.sacar(150);

        System.out.println(minhaConta);
    }
}
