public class Main {


    public static void main(String[] args) {

        Agencia agencia = new Agencia (1111, "Joao");
        Cliente cliente = new Cliente ("Gabriel", "111.111.111-11", "11111-11111");
        Conta minhaConta = new Conta (cliente, 22222, agencia, 10000);
        minhaConta.sacar (500.0);
        minhaConta.depositar(1000.0);
        minhaConta.depositar(100.50);
        minhaConta.sacar(100.0);
        System.out.println(minhaConta);
    }
}
