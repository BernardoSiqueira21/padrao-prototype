package com.example.prototype;

public class Equipamento implements Cloneable {

    private String arma;

    public Equipamento(String arma) {
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public Equipamento clone() throws CloneNotSupportedException {
        return (Equipamento) super.clone();
    }
}