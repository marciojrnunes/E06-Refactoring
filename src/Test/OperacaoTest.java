package Test;

import org.junit.Before;
import org.junit.Test;

import ContaBancaria.Operacao;

import static org.junit.Assert.*;

public class OperacaoTest {

    private Operacao operacaoDeposito;
    private Operacao operacaoSaque;

    @Before
    public void init() {
        this.operacaoDeposito = new Operacao('d', 1000);
        this.operacaoSaque = new Operacao('s', 1000);
    }

    @Test
    public void testGetTipoDep(){
        String tipoDep = this.operacaoDeposito.getTipo();
        assertEquals('d', tipoDep);

    }

    @Test
    public void testGetTipoSaque(){
        String tipoSaque = this.operacaoSaque.getTipo();
        assertEquals('s', tipoSaque);
    }
}
