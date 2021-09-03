package Test;

import org.junit.Before;
import org.junit.Test;

import ContaBancaria.Conta;

import static org.junit.Assert.*;

public class ContaTest {

    private Conta conta;

    @Before
    public void init(){
        this.conta = new Conta();
    }
    
    @Test
    public void testRealizarOperacaoDeposito(){
        this.conta.realizarOperacao('d', 1000);
        double saldo = this.conta.getSaldo();
        assertEquals(1000, saldo, 0.0);
    }

    @Test
    public void testRealizarOperacaoSaque(){
        this.conta.realizarOperacao('s', 300);
        double saldo = this.conta.getSaldo();
        assertEquals(700, saldo, 0.0);
    }

    @Test
    public void testRealizarOperacaoArrayOperacoes(){
        int tamArray = this.conta.getOperacoes().size();
        this.conta.realizarOperacao('d', 500);
        tamArray++;
        assertEquals(tamArray, this.conta.getOperacoes().size(), 0);
    }
}
