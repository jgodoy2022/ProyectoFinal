package org.example;

/**
 * La clase `Buho` es una subclase de `Animal` que representa al animal búho.
 * Este búho se identifica mediante un número num.
 * Extiende la funcionalidad de la clase base `Animal` al especificar la especie y el número asociado al búho.
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin ALejandro Godoy Vergara
 */
public class Buho extends Animal{

    /**
     * Constructor de la clase `Buho`.
     * @param num Número asociado al búho.
     */
    public Buho(int num) {
        super("Buho", num);
    }
}
