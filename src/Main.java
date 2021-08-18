public class Main {


    public static void main(String[] args) {

        Agencia a = new Agencia(2122, "Ricardo");
        Cliente c = new Cliente("Jefferson", "123.456.789-10", "1234-5678");
        Conta minhaConta = new Conta(a, c, 100, 0);

        minhaConta.depositar(100);
        minhaConta.sacar(20);
        minhaConta.depositar(5000);
        minhaConta.sacar(500);
        minhaConta.sacar(500);
        minhaConta.sacar(500);

        System.out.println(minhaConta);
    }
}
