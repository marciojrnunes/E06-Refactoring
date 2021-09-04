package Test;

import org.junit.Before;
import org.junit.Test;

import ContaBancaria.Operacao;
import ContaBancaria.OperacaoDeposito;
import ContaBancaria.OperacaoSaque;

import static org.junit.Assert.*;

public class OperacaoTest {

    private Operacao operacaoDeposito;
    private Operacao operacaoSaque;

    @Before
    public void init() {
        this.operacaoDeposito = new OperacaoDeposito(1000);
        this.operacaoSaque = new OperacaoSaque(1000);
    }

    @Test
    public void testGetTipoDep(){
        String tipoDep = this.operacaoDeposito.getTipo();
        assertEquals("Depósito", tipoDep);

    }

    @Test
    public void testGetTipoSaque(){
        String tipoSaque = this.operacaoSaque.getTipo();
        assertEquals("Saque", tipoSaque);
    }
}
