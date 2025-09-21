package br.com.sparta.model;

import java.util.List;

public class Entrada {
    private double taxa;
    private List<CotaDia> cotas;

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public List<CotaDia> getCotas() {
        return cotas;
    }

    public void setCotas(List<CotaDia> cotas) {
        this.cotas = cotas;
    }
}
