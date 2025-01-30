package src.main.java.models;

public class Receita extends Conta{

    @Override
    public double calcularSaldo() {
        return getValor();
    }
}
