package org.example;

import org.example.*;
import org.example.Animal;
import org.example.AreaSaturadaException;
import org.example.Deposito;
import org.example.Leon;

/**
 * La clase `Habitat1` representa un hábitat que alberga diferentes animales.
 * Cada animal se almacena en un depósito específico dentro del hábitat.
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin Alejandro Godoy Vergara
 */

public class Habitat1 {

    /**Representa el deposito de leones*/
    private Deposito<Animal> leon;

    /**Representa el deposito de buhos*/
    private Deposito<Animal> buho;

    /**Representa el deposito de peces*/
    private Deposito<Animal> peces;

    /**Representa el deposito de canguros*/
    private Deposito<Animal> canguro;

    /**Representa el deposito de capibaras*/
    private Deposito<Animal> capibara;

    /**Representa el deposito de serpientes*/
    private Deposito<Animal> serpiente;

    /**Entero que representa la capacidad maxima del habitat*/
    private int cont;

    /**
     * Constructor de la clase Habitat1.
     * @param num Cantidad total de animales.
     */
    public Habitat1(int num) {
        cont = 0;
        leon = new Deposito<>();
        buho = new Deposito<>();
        peces = new Deposito<>();
        canguro = new Deposito<>();
        capibara = new Deposito<>();
        serpiente = new Deposito<>();

        // Crear instancias de diferentes tipos de animales y agregarlos a los depósitos correspondientes.
        for(int i=0; i<num; i++){
            Animal a = new Leon(i);
            Animal b = new Buho(i);
            Animal c = new Peces(i);
            Animal d = new Canguro(i);
            Animal e = new Capibara(i);
            Animal f = new Serpiente(i);

            leon.addCosas(a);
            buho.addCosas(b);
            peces.addCosas(c);
            canguro.addCosas(d);
            capibara.addCosas(e);
            serpiente.addCosas(f);

        }
    }

    /**
     * Método para mostrar un animal de un tipo específico en el hábitat.
     * @param n Tipo de animal.
     * @return Instancia del animal mostrado.
     * @throws AreaSaturadaException Si el área está saturada.
     */
    public Animal mostrarAnimal(int n) throws AreaSaturadaException {
        if(n!=TipoAnimal.LEON.getOpcion() && n != TipoAnimal.SERPIENTE.getOpcion() && n != TipoAnimal.CAPIBARA.getOpcion() && n!=TipoAnimal.BUHO.getOpcion() && n != TipoAnimal.PECES.getOpcion() && n != TipoAnimal.CANGURO.getOpcion()){
            return null;
        }
        else if (this.cont == 5) {
            throw new AreaSaturadaException("Error. Área Saturada");
        }
        else if (n == TipoAnimal.LEON.getOpcion() && (leon.sizeCosas() > 0)) {
            this.cont += 1;
            return leon.getCosas();
        } else if (n == TipoAnimal.BUHO.getOpcion() && (buho.sizeCosas() > 0)) {
            this.cont += 1;
            return buho.getCosas();
        } else if (n == TipoAnimal.PECES.getOpcion() && (peces.sizeCosas() > 0)) {
            this.cont += 1;
            return peces.getCosas();
        } else if (n == TipoAnimal.CANGURO.getOpcion() && (canguro.sizeCosas() > 0)) {
            this.cont += 1;
            return canguro.getCosas();
        } else if (n == TipoAnimal.CAPIBARA.getOpcion() && (capibara.sizeCosas() > 0)) {
            this.cont += 1;
            return capibara.getCosas();
        } else if (n == TipoAnimal.SERPIENTE.getOpcion() && (serpiente.sizeCosas() > 0)) {
            this.cont += 1;
            return serpiente.getCosas();
        }
        return null;
    }
}
