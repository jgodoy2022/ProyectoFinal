package org.example;

/**
 * La clase Animal es una clase abstracta que sirve como base para representar animales.
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin Alejandro Godoy Vergara
 */
public abstract class Animal {
    /** String que almacena la especie de un animal*/
    private String especie;

    /** Entero que almacena el numero de un animal*/
    private int num;

    /**
     * Constructor de la clase Animal.
     * @param especie La especie del animal.
     * @param num El número asociado al animal.
     */
    public Animal(String especie, int num){
        this.especie = especie;
        this.num = num;
    }

    /**
     * Método toString() que devuelve una representación en cadena de texto del objeto Animal.
     * @return Cadena de texto representando el objeto Animal.
     */
    @Override
    public String toString() {
        return "Animal" + num + ": " + "especie = '" + especie + '.';
    }
}
