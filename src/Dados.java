import java.util.List;

public class Dados {

    private int numAgencia;
    private int numConta;
    private String gerente;
    private double saldo;

    private List<Operacao> operacoes;

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void realizaOperacao(char tipo, int valor){

        if (tipo == 'd')
            this.saldo += valor;
        else if(tipo == 's')
            this.saldo -= valor;

        Operacao op = new Operacao(tipo, valor);
        this.operacoes.add(op);


    }

    public String toString(){
        return String.format("Ag.: %d\nConta: %d\nGerente: %s\nSaldo: %.2f",
                this.numAgencia, this.numConta, this.gerente, this.saldo);

    }

    public String extratoOperacoes(){

        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }

        return dadosExtrato;
    }

    public void setOperacoes(List<Operacao> operacoes) {
        this.operacoes = operacoes;
    }
}
