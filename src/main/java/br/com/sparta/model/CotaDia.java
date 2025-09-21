package br.com.sparta.model;

import java.util.List;

public class CotaDia {
    private double valor;
    private List<Double> quantidades;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Double> getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(List<Double> quantidades) {
        this.quantidades = quantidades;
    }
}
