package org.example;

/**
 * La clase `Canguro` es una subclase de `Animal` que representa al animal canguro.
 * Este canguro se identifica mediante un número num.
 * Extiende la funcionalidad de la clase base `Animal` al especificar la especie y el número asociado al canguro.
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin ALejandro Godoy Vergara
 */
public class Canguro extends Animal{

    /**
     * Constructor de la clase `Canguro`.
     * @param num Número asociado al canguro.
     */
    public Canguro(int num) {
        super("Canguro", num);
    }
}
