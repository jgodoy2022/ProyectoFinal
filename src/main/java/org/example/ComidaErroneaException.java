package org.example;


/**
 * La clase representa una excepción personalizada que se lanza cuando se produce un error relacionado con la
 * comida dada a los animales en cuanto a compatibilidad
 * @author Joaquin Alejandro Godoy Vergarax
 * @author Gabriela Isidora Zambrano Novoa
 */
public class ComidaErroneaException extends Exception{

    /** crea una nueva instancia de la excepción con un mensaje descriptivo
     * @param message mensaje que describe la razón del error
     */
    public ComidaErroneaException(String message) {
        super(message);
    }
}
