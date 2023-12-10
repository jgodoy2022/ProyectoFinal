package org.example;

public abstract class Animal {
    private String especie;
    private int num;
    public Animal(String especie, int num){
        this.especie = especie;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Animal" + num + ": " + "especie = '" + especie + '.';
    }
}
