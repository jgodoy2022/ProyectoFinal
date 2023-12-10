package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal animal = new EjemploAnimal("Tigre", 1);
        String expected = "Animal1: especie = 'Tigre.";
        String actual = animal.toString();
        assertEquals(expected, actual);
    }
    private static class EjemploAnimal extends Animal {
        public EjemploAnimal(String especie, int num) {
            super(especie, num);
        }
    }
}
