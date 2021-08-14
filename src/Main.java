public class Main {


    public static void main(String[] args) {

        Agencia agencia = new Agencia(4444, "José");
        Cliente cliente = new Cliente("Rodoberto", "555.555.555-55", "9999-9999");
        Conta minhaConta = new Conta(cliente, agencia);

        minhaConta.depositar(500);
        minhaConta.sacar(400);
        minhaConta.sacar(500);
        minhaConta.depositar(1000);
        minhaConta.sacar(200);
        minhaConta.sacar(200);
        minhaConta.sacar(400);

        System.out.println(minhaConta);
    }
}
