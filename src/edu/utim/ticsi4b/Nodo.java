package edu.utim.ticsi4b;

/**
 * Created by HP on 30/10/2017.
 */
public class Nodo {

    Object valor;
    Nodo siguiente;

    public Nodo(Object valor){
        this.valor = valor;
        this.siguiente=null;
    }
    public void enlazarSiguiente(Nodo n){
        siguiente= n;
    }
    public  Nodo obtenerSiguiente(){
        return siguiente;
    }
    public Object obtenerValor(){
        return  valor;
    }
}
