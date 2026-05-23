package com.example.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {

    @Test
    void testClonePersonagem()
            throws CloneNotSupportedException {

        Equipamento equipamento =
                new Equipamento("Arco");

        Personagem original =
                new Personagem("Arqueiro", equipamento);

        Personagem clone = original.clone();

        clone.setNome("Arqueiro Clone");

        assertEquals("Arqueiro", original.getNome());

        assertEquals(
                "Arqueiro Clone",
                clone.getNome()
        );
    }

    @Test
    void testCloneIndependente()
            throws CloneNotSupportedException {

        Equipamento equipamento =
                new Equipamento("Machado");

        Personagem original =
                new Personagem("Anão", equipamento);

        Personagem clone = original.clone();

        clone.getEquipamento()
                .setArma("Martelo");

        assertEquals(
                "Machado",
                original.getEquipamento().getArma()
        );

        assertEquals(
                "Martelo",
                clone.getEquipamento().getArma()
        );
    }
}