public class Main {


    public static void main(String[] args) {

        Cliente cliente = new Cliente("João", "111.111.111-11", "31 1111-1111");
        DadosConta dadosConta = new DadosConta(111, 222222, "Gil", 0.00);
        Conta minhaConta = new Conta(cliente, dadosConta);


        minhaConta.depositar(450);
        minhaConta.sacar(50);
        minhaConta.sacar(50);
        minhaConta.sacar(50);

        System.out.println(minhaConta);
    }
}
