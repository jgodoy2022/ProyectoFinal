package org.example.Utilidad;
import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<T> Cosas;
    public Deposito() {
        Cosas = new ArrayList();
    }
    public void addCosas(T b){
        Cosas.add(b);
    }
    public T getCosas(){
        if(Cosas.size() != 0){
            return Cosas.remove(0);
        }
        return null;
    }
    public int sizeCosas(){
        return Cosas.size();
    }
}
