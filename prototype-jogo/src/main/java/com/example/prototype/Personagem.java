package com.example.prototype;

public class Personagem implements Cloneable {

    private String nome;
    private Equipamento equipamento;

    public Personagem(String nome, Equipamento equipamento) {
        this.nome = nome;
        this.equipamento = equipamento;
    }

    public String getNome() {
        return nome;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Personagem clone() throws CloneNotSupportedException {

        Personagem personagemClone =
                (Personagem) super.clone();

        personagemClone.equipamento =
                equipamento.clone();

        return personagemClone;
    }
}