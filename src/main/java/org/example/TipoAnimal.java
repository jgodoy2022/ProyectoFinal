package org.example;

/**
 * La enumeración `TipoAnimal` define constantes para diferentes tipos de animales en un hábitat.
 * La opción numérica se utiliza para identificar y seleccionar tipos específicos de animales.
 * @author Joaquin Alejandro Godoy Vergara
 * @author Gabriela Isidora Zambrano Novoa
 */
public enum TipoAnimal {

    /** elementos de la enumeración, que tienen la opcióno*/
    LEON(1),
    CAPIBARA(2),
    CANGURO(3),
    SERPIENTE(4),
    PECES(5),
    BUHO(6);

    /**entero para almacenar la opción a escoger por el cliente*/
    private final int opcion;

    /**
     * Constructor por defecto`.
     * Asocia una opción numérica de cada animal.
     * @param opcion Número único asociado al tipo de animal.
     */
    TipoAnimal(int opcion){
        this.opcion = opcion;
    }

    /**
     * @return Opción numérica única asociada al tipo de animal.
     */
    public int getOpcion(){
        return opcion;
    }
}
