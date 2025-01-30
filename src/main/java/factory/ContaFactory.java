package src.main.java.factory;

import src.main.java.models.Conta;

public class ContaFactory {

    private static ContaFactory contaFactory;

    private ContaFactory() {}

    public static ContaFactory getInstancia() {
        if (contaFactory == null) {
            contaFactory = new ContaFactory();
        }
        return contaFactory;
    }

    public static Conta tipoConta(String operacao) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("src.main.java.models." + operacao);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Conta inexistente");
        }
        if (!(objeto instanceof Conta)) {
            throw new IllegalArgumentException("Conta inválida");
        }
        return (Conta) objeto;
    }

}
