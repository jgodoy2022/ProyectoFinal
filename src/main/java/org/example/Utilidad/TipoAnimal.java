package org.example.Utilidad;

public enum TipoAnimal {
    LEON(1),
    CARPINCHO(2),
    CANGURO(3),
    SERPIENTE(4),
    PECES(5),
    BUHO(6);

    private final int opcion;

    TipoAnimal(int opcion){
        this.opcion = opcion;
    }
    public int getOpcion(){
        return opcion;
    }
}
