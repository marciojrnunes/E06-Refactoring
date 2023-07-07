import java.util.List;

public class Extrato {
    private Cliente cliente;
    private Conta conta;
    private List<Operacao> operacoes;

    public Extrato(Cliente cliente, Conta conta, List<Operacao> operacoes) {
        this.cliente = cliente;
        this.conta = conta;
        this.operacoes = operacoes;
    }

    public void gerarExtrato() {
        System.out.println("-----EXTRATO-----");
        System.out.println("-----CLIENTE-----");
        System.out.println("CPF: " + cliente.getCpfCliente());
        System.out.println("Nome: " + cliente.getNomeCliente());
        System.out.println("Telefone: " + cliente.getTelefoneCliente());
        System.out.println();
        System.out.println("-----CONTA-----");
        System.out.println("Ag.: " + conta.getNumAgencia());
        System.out.println("Conta: " + conta.getNumConta());
        System.out.println("Gerente: " + conta.getGerente());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println();
        System.out.println("-----EXTRATO-----");

        for (Operacao op : operacoes) {
            System.out.println(op.toString());
        }
       
    }
    
}
