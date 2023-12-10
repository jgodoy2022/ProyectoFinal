package org.example;

/**
 * La clase `Comida` es una clase abstracta que sirve como base para representar alimentos para los animales.
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin Alejandro Godoy Vergara
 */
public abstract class Comida {

    /** Entero que almacena el numero de una comida*/
    private int num;

    /**
     * Constructor de la clase `Comida`.
     * @param num Número asociado a la comida.
     */
    public Comida(int num){
        this.num = num;
    }

    /**
     * Devuelve una representación en cadena de la comida.
     * @return Cadena que representa la comida.
     */
    @Override
    public String toString() {
        return "Comida" + num + '.';
    }
}
