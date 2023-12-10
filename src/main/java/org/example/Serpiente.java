package org.example;

/**
 * La clase `Serpiente` es una subclase de `Animal` que representa al animal serpiente.
 * Este leon se identifica mediante un número num.
 * Extiende la funcionalidad de la clase base `Animal` al especificar la especie y el número asociado al serpiente.
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin ALejandro Godoy Vergara
 */
public class Serpiente extends Animal{

    /**
     * Constructor de la clase `Serpiente`.
     * @param num Número asociado al serpiente.
     */
    public Serpiente(int num) {
        super("Serpiente", num);
    }
}
