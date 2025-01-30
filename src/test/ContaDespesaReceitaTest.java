package src.test;

import src.main.java.factory.ContaFactory;
import src.main.java.models.Conta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ContaDespesaReceitaTest {

    @Test
    public void deveCalcularSaldoParaReceita() {
        Conta receita = ContaFactory.tipoConta("Receita");
        receita.setValor(100.0f);
        assertEquals(100.0, receita.calcularSaldo(), "O saldo da receita não foi calculado corretamente");
    }

    @Test
    public void deveCalcularSaldoParaDespesa() {
        Conta despesa = ContaFactory.tipoConta("Despesa");
        despesa.setValor(50.0f);
        assertEquals(-50.0, despesa.calcularSaldo(), "O saldo da despesa não foi calculado corretamente");
    }
}