import java.util.ArrayList;
import java.util.List;

public class Conta {

    private final Cliente cliente;
    private DadosConta dadosConta;
    private List<Operacao> operacoes;

    public Conta(Cliente cliente, DadosConta dadosConta) {
        this.cliente = cliente;
        this.dadosConta = dadosConta;
        this.operacoes = new ArrayList<>();
    }


    public void depositar(int valor) {
        dadosConta.depositar(valor);
        operacoes.add(new Operacao('d', valor));
    }

    public void sacar(int valor) {
        dadosConta.sacar(valor);
        operacoes.add(new Operacao('s', valor));
    }



    public String gerarExtrato(){
        StringBuilder extrato = new StringBuilder();
        for (Operacao op : operacoes) {
            extrato.append(op).append("\n");
        }
        return extrato.toString();
    }


    @Override
    public String toString() {


        return "-----CLIENTE-----\n" +
                cliente +
                "\n\n" +
                "-----CONTA-----\n" +
                dadosConta +

                "\n\n" +
                "-----EXTRATO-----\n" +
                gerarExtrato() +
                "\n";

    }
}
