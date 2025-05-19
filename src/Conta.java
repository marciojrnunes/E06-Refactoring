import java.util.ArrayList;
import java.util.List;

public class Conta {
    private Cliente dadosCliente;
    private DadosConta dadosConta;
    private List<Operacao> operacoes;

    public Conta(Cliente dadosCliente, DadosConta dadosConta) {
      this.dadosCliente = dadosCliente;
      this.dadosConta = dadosConta;

        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null);
    }

    public void realizarOperacao(char tipo, int valor) {
        Operacao op = new Operacao(tipo, valor);
        this.operacoes.add(op);

        if (tipo == 'd')
            this.dadosConta.setSaldoConta(dadosConta.getSaldoConta() + valor);
        else if(tipo == 's')
            this.dadosConta.setSaldoConta(dadosConta.getSaldoConta() - valor);
    }

    public String dadosExtrato(){
        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }
        return dadosExtrato;
    }
    public String toString() {
        return "-----CLIENTE-----\n" +
                dadosCliente +
                "\n\n" +
                "-----CONTA-----\n" +
                dadosConta +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato() +
                "\n";
    }
}
