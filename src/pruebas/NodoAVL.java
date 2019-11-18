/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Cristhian
 */
public class NodoAVL<T> {
    public T dato;
    int fe;
    String comparador;
    NodoAVL hijoizquierdo,hijoderecho;
    public NodoAVL(T dato,String comparador){
        this.dato = dato;
        this.fe = 0;
        this.comparador = comparador;
        this.hijoderecho = null;
        this.hijoderecho = null;
    }

    public String getComparador() {
        return comparador;
    }

    public void setComparador(String comparador) {
        this.comparador = comparador;
    }

    public T getDato() {
        return dato;
    }

    public int getFe() {
        return fe;
    }

    public NodoAVL getHijoizquierdo() {
        return hijoizquierdo;
    }

    public NodoAVL getHijoderecho() {
        return hijoderecho;
    }
}

