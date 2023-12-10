package org.example.Habitats;

import org.example.*;
import org.example.Animal;
import org.example.AreaSaturadaException;
import org.example.Deposito;
import org.example.Leon;

public abstract class Habitat1 {
    private Deposito<Animal> leon;
    public Habitat1(int num) {
        leon = new Deposito<>();
        for(int i=0; i<num; i++){
            Animal a = new Leon(i);
            leon.addCosas(a);
        }
    }

    public Animal mostrarAnimal(int n) throws AreaSaturadaException {
        if(n >= 5){
            throw new AreaSaturadaException("Error. Área Saturada");
        }
        else if(n == org.example.TipoAnimal.LEON.getOpcion() && (leon.sizeCosas() > 0)){
            return leon.getCosas();
        }
        else{
            return null;
        }
    }
}
