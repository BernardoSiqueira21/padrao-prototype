package com.example.prototype;

public class Main {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Equipamento espada =
                new Equipamento("Espada de Ferro");

        Personagem original =
                new Personagem("Guerreiro", espada);

        Personagem clone =
                original.clone();

        clone.setNome("Guerreiro Clone");

        clone.getEquipamento()
                .setArma("Espada Lendária");

        System.out.println("Original:");
        System.out.println(original.getNome());
        System.out.println(
                original.getEquipamento().getArma());

        System.out.println();

        System.out.println("Clone:");
        System.out.println(clone.getNome());
        System.out.println(
                clone.getEquipamento().getArma());
    }
}