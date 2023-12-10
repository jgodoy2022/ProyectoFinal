package org.example;

/**
 * La clase `Leon` es una subclase de `Animal` que representa al animal leon.
 * Este leon se identifica mediante un número num.
 * Extiende la funcionalidad de la clase base `Animal` al especificar la especie y el número asociado al leon.
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin ALejandro Godoy Vergara
 */
public class Leon extends Animal{

    /**
     * Constructor de la clase `Leon`.
     * @param num Número asociado al leon.
     */
    public Leon(int num) {
        super("León", num);
    }
}
