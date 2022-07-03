public class Main {


    public static void main(String[] args) {

        Agencia novaAgencia = new Agencia (1111, "Novo gerente");
        Cliente novoCliente = new Cliente ("Brenda", "111.111.111-11", "99999-9999");
        Conta novaConta = new Conta (novoCliente, 22222, novaAgencia, 1000.50);

        novaConta.sacar (500.0);
        novaConta.depositar(1000.0);
        novaConta.depositar(5.5);
        novaConta.sacar(100.0);

        System.out.println(novaConta);
        
    }
}
