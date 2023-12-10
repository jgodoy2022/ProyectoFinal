package org.example;

import org.example.*;
import org.example.Animal;
import org.example.AreaSaturadaException;
import org.example.Deposito;
import org.example.Leon;

public class Habitat1 {
    private Deposito<Animal> leon;
    private Deposito<Animal> buho;
    private Deposito<Animal> peces;
    private Deposito<Animal> canguro;
    private Deposito<Animal> capibara;
    private Deposito<Animal> serpiente;
    private int cont;
    public Habitat1(int num) {
        cont = 0;
        leon = new Deposito<>();
        buho = new Deposito<>();
        peces = new Deposito<>();
        canguro = new Deposito<>();
        capibara = new Deposito<>();
        serpiente = new Deposito<>();
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
