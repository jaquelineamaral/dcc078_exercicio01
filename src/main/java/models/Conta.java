package src.main.java.models;

import java.time.LocalDate;


public abstract class Conta {

    private String descricao;
    private float valor;
    private LocalDate data;

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public float getValor() { return valor; }
    public void setValor(float valor) { this.valor = valor; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public abstract double calcularSaldo();

}
