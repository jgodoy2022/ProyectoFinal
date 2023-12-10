package org.example;

/**
 * La clase representa una excepción personalizada que se lanza cuando se produce un error relacionado con el
 * habitat y la compatibilidad del animal con este.
 * @author Joaquin Alejandro Godoy Vergarax
 * @author Gabriela Isidora Zambrano Novoa
 */
public class HabitatIncorrectoException extends Exception{

    /** crea una nueva instancia de la excepción con un mensaje descriptivo
     * @param message mensaje que describe la razón del error
     */
    public HabitatIncorrectoException(String message) {
        super(message);
    }
}
