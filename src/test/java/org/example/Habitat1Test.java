package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Habitat1Test {

    @Test
    void mostrarAnimal() throws AreaSaturadaException {
        int numAnimales = 3;
        Habitat1 habitat = new Habitat1(numAnimales);

        assertNotNull(habitat.mostrarAnimal(TipoAnimal.LEON.getOpcion()));
        assertNotNull(habitat.mostrarAnimal(TipoAnimal.BUHO.getOpcion()));
        assertNotNull(habitat.mostrarAnimal(TipoAnimal.PECES.getOpcion()));
        assertNotNull(habitat.mostrarAnimal(TipoAnimal.BUHO.getOpcion()));
        assertNotNull(habitat.mostrarAnimal(TipoAnimal.PECES.getOpcion()));

        assertNull(habitat.mostrarAnimal(10));
    }
}
