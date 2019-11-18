/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasDatos;

import java.util.ArrayList;

/**
 *
 * @author Tania
 */
public class Semillero {
    private String nombre;
    private String temas;
    private ArrayList<Estudiante> miembro;
    private Profesor profesor;
    private Publicacion publicacion;

    public Semillero(String nombre, String temas, ArrayList<Estudiante> miembro, Profesor profesor, Publicacion publicacion) {
        this.nombre = nombre;
        this.temas = temas;
        this.miembro = miembro;
        this.profesor = profesor;
        this.publicacion = publicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    public ArrayList<Estudiante> getMiembro() {
        return miembro;
    }

    public void setMiembro(ArrayList<Estudiante> miembro) {
        this.miembro = miembro;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
    
    
    
    
     
    
}
