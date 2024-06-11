import java.util.ArrayList;
import java.util.List;

public class Conta {
   
    private Cliente cliente;
    private Agencia agencia;
    private double saldo;

    private List<Operacao> operacoes;

    public Conta(Cliente cliente, Agencia agencia, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
        this.operacoes = new ArrayList<>();
    }

    public void realizarOperacao(char tipo, double valor) {
        Operacao op = new Operacao(tipo, valor);
        if (tipo == 'd'){
            op.depositar(this, valor);
        }else if(tipo == 's'){
            op.sacar(this, valor);
        }else{
            System.out.println("Operação selecionada não existe.");
            return;
        }
        operacoes.add(op);
    }

    private String gerarExtrato(){
        StringBuilder extrato = new StringBuilder();
        for (Operacao op : this.operacoes){
            extrato.append(op.toString()).append("\n");
        }
        return extrato.toString();
    }

    public String toString() {
        String dadosCliente = cliente.toString();
        String dadosConta = agencia.toString() + String.format("\nSaldo: %.2f", this.saldo);
        String dadosExtrato = gerarExtrato();

        return "-----CLIENTE-----\n" +
                dadosCliente +
                "\n\n" +
                "-----CONTA-----\n" +
                dadosConta +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato +
                "\n";
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Operacao> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(List<Operacao> operacoes) {
        this.operacoes = operacoes;
    }
}
