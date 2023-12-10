package org.example;

public class Usuario1 {
    private Deposito<Comida> carne;
    private Deposito<Comida> hierba;
    private Deposito<Comida> pescado;
    private Deposito<Comida> plancton;

    public Usuario1(int num) {
        carne = new Deposito<>();
        hierba = new Deposito<>();
        pescado = new Deposito<>();
        plancton = new Deposito<>();

        for(int i=0; i<num; i++){
            Comida a = new Carne(i);
            Comida b = new Hierba(i);
            Comida c = new Pescado(i);
            Comida d = new Plancton(i);

            carne.addCosas(a);
            hierba.addCosas(b);
            pescado.addCosas(c);
            plancton.addCosas(d);
        }
    }


}
