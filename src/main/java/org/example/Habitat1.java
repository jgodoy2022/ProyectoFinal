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
    private int contleon;
    private int contbuho;
    private int contcanguro;
    private int contcapibara;
    private int contpeces;
    private int contserpiente;

    /**
     * Constructor de la clase Habitat1.
     * @param num Cantidad total de animales.
     */
    public Habitat1(int num) {
        contbuho = 0;
        contcanguro = 0;
        contcapibara = 0;
        contpeces = 0;
        contleon = 0;
        contserpiente=0;
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
        else if (this.contleon == 5 || this.contserpiente==5 || this.contpeces==5 || this.contcapibara==5 || this.contbuho==5 || this.contcanguro==5) {
            throw new AreaSaturadaException("Error. Área Saturada");
        }
        else if (n == TipoAnimal.LEON.getOpcion() && (leon.sizeCosas()-1 > 0)) {
            this.contleon += 1;
            return leon.getCosas();
        } else if (n == TipoAnimal.BUHO.getOpcion() && (buho.sizeCosas()-1 > 0)) {
            this.contbuho += 1;
            return buho.getCosas();
        } else if (n == TipoAnimal.PECES.getOpcion() && (peces.sizeCosas()-1 > 0)) {
            this.contpeces += 1;
            return peces.getCosas();
        } else if (n == TipoAnimal.CANGURO.getOpcion() && (canguro.sizeCosas()-1 > 0)) {
            this.contcanguro += 1;
            return canguro.getCosas();
        } else if (n == TipoAnimal.CAPIBARA.getOpcion() && (capibara.sizeCosas()-1 > 0)) {
            this.contcapibara += 1;
            return capibara.getCosas();
        } else if (n == TipoAnimal.SERPIENTE.getOpcion() && (serpiente.sizeCosas()-1 > 0)) {
            this.contserpiente += 1;
            return serpiente.getCosas();
        }
        return null;
    }

    /**
     * @return reinicia el contador de buhos a cero
     */
    public int cerobuho(){
        return contbuho=0;
    }

    /**
     * @return reinicia el contador de canguros a cero
     */
    public int cerocanguro(){
        return contcanguro=0;
    }

    /**
     * @return reinicia el contador de capibaras a cero
     */
    public int cerocapibara(){
        return contcapibara=0;
    }

    /**
     * @return reinicia el contador de leon a cero
     */
    public int ceroleon(){
        return contleon=0;
    }

    /**
     * @return reinicia el contador de peces a cero
     */
    public int ceropeces(){
        return contpeces=0;
    }

    /**
     * @return reinicia el contador de serpientes a cero
     */
    public int ceroserpiente(){
        return contserpiente=0;
    }
}
