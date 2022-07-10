public class Main {


    public static void main(String[] args) {

        Cliente cliente = new Cliente("Gabriel", "151.142.954-21", "31 8561-4513");
        DB db = new DB(351, 547154, "Teste");
        Conta minhaConta = new Conta(cliente, db, 0.00);

        minhaConta.realizarOperacao('d', 85412);
        minhaConta.realizarOperacao('s', 20000);
        minhaConta.realizarOperacao('s', 854);
        minhaConta.realizarOperacao('s', 785);

        System.out.println(minhaConta);
    }
}
