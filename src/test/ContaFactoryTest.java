package src.test;

import org.junit.jupiter.api.Test;
import src.main.java.factory.ContaFactory;
import static org.junit.jupiter.api.Assertions.*;

class ContaFactoryTest {

    @Test
    public void deveRetornarInstanciaSingleton() {
        ContaFactory instancia1 = ContaFactory.getInstancia();
        ContaFactory instancia2 = ContaFactory.getInstancia();
        assertSame(instancia1, instancia2, "ContaFactory não está implementado como Singleton");
    }

    @Test
    public void deveLancarExcecaoParaContaInexistente() {
        assertThrows(IllegalArgumentException.class,
                () -> ContaFactory.tipoConta("Investimento"),
                "Conta inexistente deveria lançar exceção");
    }

    @Test
    public void deveLancarExcecaoParaClasseNaoConta() {
        assertThrows(IllegalArgumentException.class,
                () -> ContaFactory.tipoConta("String"),
                "Classe que não é do tipo Conta deveria lançar exceção");
    }
}
