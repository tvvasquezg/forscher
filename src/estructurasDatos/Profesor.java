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
public class Profesor extends Persona {
       private String materia;
       private String facultad;
       private String centroEducativo;
       
       
       
       
    public Profesor(String idUsuario, String nombre, String apellido,String genero, String contrasena,String materia, String facultad, String centroEducativo,String descripcion) {
        super(idUsuario, nombre, apellido,genero, contrasena,descripcion);
        this.materia = materia;
        this.facultad = facultad;
        this.centroEducativo = centroEducativo;
    }

    public String getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
       
}
