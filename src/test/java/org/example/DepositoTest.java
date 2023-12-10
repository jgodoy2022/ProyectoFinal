package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositoTest {

    @org.junit.jupiter.api.Test
    void addCosas() {
        Deposito leon = new Deposito<Animal>();
        Animal l = new Leon(1);
        leon.addCosas(l);
        assertEquals(1,leon.sizeCosas());
    }

    @org.junit.jupiter.api.Test
    void getCosas() {
        Deposito leon = new Deposito<Animal>();
        Animal l = new Leon(1);
        leon.addCosas(l);
        assertEquals(l,leon.getCosas());
    }

    @org.junit.jupiter.api.Test
    void sizeCosas() {
        Deposito leon = new Deposito<Animal>();
        assertEquals(0,leon.sizeCosas());
        Animal l = new Leon(1);
        leon.addCosas(l);
        assertEquals(1,leon.sizeCosas());
    }
}