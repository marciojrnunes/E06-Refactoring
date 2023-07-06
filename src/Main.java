public class Main {


    public static void main(String[] args) {

        Cliente novoCliente = new Cliente("João", "123.456.789-12", "(31)93030-5050");
        Agencia novaAgencia = new Agencia(1010, "Gerente");
        Conta minhaConta = new Conta(novoCliente, 121212, novaAgencia, 5000.0);

        minhaConta.depositar(300);
        minhaConta.sacar(1000);
        minhaConta.sacar(100);
        minhaConta.depositar(600);

        System.out.println(minhaConta);
    }
}
