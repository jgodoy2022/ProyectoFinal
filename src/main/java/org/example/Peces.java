package org.example;

/**
 * La clase `Peces` es una subclase de `Animal` que representa al animal pez.
 * Este leon se identifica mediante un número num.
 * Extiende la funcionalidad de la clase base `Animal` al especificar la especie y el número asociado al pez.
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin ALejandro Godoy Vergara
 */
public class Peces extends Animal{

    /**
     * Constructor de la clase `Peces`.
     * @param num Número asociado al pez.
     */
    public Peces(int num) {
        super("Peces", num);
    }
}
