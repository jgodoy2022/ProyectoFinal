package org.example.Comidas;

public abstract class Comida {
    private int num;
    public Comida(int num){
        this.num = num;
    }
    @Override
    public String toString() {
        return "Comida" + num + '.';
    }
}
