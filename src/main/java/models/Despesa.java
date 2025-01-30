package src.main.java.models;

public class Despesa extends Conta{

    @Override
    public double calcularSaldo() {
        return -getValor();
    }
}
