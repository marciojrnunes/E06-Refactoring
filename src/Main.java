public class Main {


    public static void main(String[] args) {

        Cliente novoCliente = new Cliente("Vicente","777.777.777-79","31 99999-9999");
        DadosConta novosDados = new DadosConta(69, 420,"João");
        Conta minhaConta = new Conta(novoCliente, novosDados, 0.0);

        minhaConta.depositar(450);
        minhaConta.sacar(50);
        minhaConta.sacar(50);
        minhaConta.sacar(50);

        System.out.println(minhaConta);
    }
}
