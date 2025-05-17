public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marina Villaça", "100.100.100-00", "31 3131-3131");
        Conta minhaConta = new Conta(111, 222222, "Bia Castro", 1000.00, cliente1);

        minhaConta.realizarOperacao('s', 150);
        minhaConta.realizarOperacao('s', 100);
        minhaConta.realizarOperacao('d', 450);

        System.out.println(minhaConta);
        System.out.println(minhaConta.gerarExtrato());
    }
}