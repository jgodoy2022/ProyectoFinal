package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoAnimalTest {

    @Test
    void getOpcion() {
        assertEquals(1, TipoAnimal.LEON.getOpcion());
        assertEquals(2, TipoAnimal.CAPIBARA.getOpcion());
        assertEquals(3, TipoAnimal.CANGURO.getOpcion());
        assertEquals(4, TipoAnimal.SERPIENTE.getOpcion());
        assertEquals(5, TipoAnimal.PECES.getOpcion());
        assertEquals(6, TipoAnimal.BUHO.getOpcion());
    }

    @Test
    void values() {
        TipoAnimal[] expectedValues = {TipoAnimal.LEON, TipoAnimal.CAPIBARA, TipoAnimal.CANGURO, TipoAnimal.SERPIENTE, TipoAnimal.PECES, TipoAnimal.BUHO};
        assertArrayEquals(expectedValues, TipoAnimal.values());
    }

    @Test
    void valueOf() {
        assertEquals(TipoAnimal.LEON, TipoAnimal.valueOf("LEON"));
        assertEquals(TipoAnimal.CAPIBARA, TipoAnimal.valueOf("CAPIBARA"));
        assertEquals(TipoAnimal.CANGURO, TipoAnimal.valueOf("CANGURO"));
        assertEquals(TipoAnimal.SERPIENTE, TipoAnimal.valueOf("SERPIENTE"));
        assertEquals(TipoAnimal.PECES, TipoAnimal.valueOf("PECES"));
        assertEquals(TipoAnimal.BUHO, TipoAnimal.valueOf("BUHO"));
    }
}
