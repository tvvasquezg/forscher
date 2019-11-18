/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasDatos;

/**
 *
 * @author Tania
 */
public class Nodo {
    private Nodo siguiente;
    private Object datos;
    Nodo(Object dato){
        this.datos = dato;
        this.siguiente = null;
    }

    public void setDatos(Object datos) {
        this.datos = datos;
    }


    
    
    Nodo verSiguente(){
        return this.siguiente;
        }
    void agregar(Nodo n){
    this.siguiente = n;
    
    }
    Object verDato(){
    return this.datos;
    }    
}
