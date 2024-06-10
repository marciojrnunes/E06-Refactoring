public class Agencia {
    private int numero;
    private String gerente;

    public Agencia(int numero, String gerente) {
        this.numero = numero;
        this.gerente = gerente;

    }

    public int getNumero() {
        return numero;
    }

    public String getGerente() {
        return gerente;
    }

    // Método para gerar os dados da conta
    public String dadosAgencia() {
        return String.format("Agência: %d\nGerente: %s", numero, gerente);
    }
}