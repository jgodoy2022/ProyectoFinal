package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Habitat1Test {

    @Test
    void mostrarAnimal() throws AreaSaturadaException {
        // Crear un hábitat con un número específico de animales
        int numAnimales = 3;
        Habitat1 habitat = new Habitat1(numAnimales);

        // Mostrar algunos animales, debería funcionar correctamente
        assertNotNull(habitat.mostrarAnimal(TipoAnimal.LEON.getOpcion()));
        assertNotNull(habitat.mostrarAnimal(TipoAnimal.BUHO.getOpcion()));
        assertNotNull(habitat.mostrarAnimal(TipoAnimal.PECES.getOpcion()));
        assertNotNull(habitat.mostrarAnimal(TipoAnimal.BUHO.getOpcion()));
        assertNotNull(habitat.mostrarAnimal(TipoAnimal.PECES.getOpcion()));

        // Intentar mostrar más animales después de alcanzar el límite debería lanzar una excepción
        assertThrows(AreaSaturadaException.class, () -> habitat.mostrarAnimal(TipoAnimal.CANGURO.getOpcion()));
        assertThrows(AreaSaturadaException.class, () -> habitat.mostrarAnimal(TipoAnimal.CAPIBARA.getOpcion()));
        assertThrows(AreaSaturadaException.class, () -> habitat.mostrarAnimal(TipoAnimal.SERPIENTE.getOpcion()));

        // Verificar que no se pueden mostrar animales de un tipo que no existe
        assertNull(habitat.mostrarAnimal(10));
    }
}
