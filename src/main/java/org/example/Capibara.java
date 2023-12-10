package org.example;

/**
 * La clase `Capibara` es una subclase de `Animal` que representa al animal capibara.
 * Este capibara se identifica mediante un número num.
 * Extiende la funcionalidad de la clase base `Animal` al especificar la especie y el número asociado al capibara.
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin ALejandro Godoy Vergara
 */
public class Capibara extends Animal{

    /**
     * Constructor de la clase `Capibara`.
     * @param num Número asociado al capibara.
     */
    public Capibara(int num) {
        super("Capibara", num);
    }
}
