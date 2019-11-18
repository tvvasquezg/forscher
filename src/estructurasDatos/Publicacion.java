/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasDatos;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import javax.print.attribute.standard.DateTimeAtCreation;

/**
 *
 * @author Tania
 */
public class Publicacion {
    private String nombre;
    private DateTimeAtCreation fecha;
    private String autor;

    public Publicacion(String nombre, DateTimeAtCreation fecha, String autor) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DateTimeAtCreation getFecha() {
        return fecha;
    }

    public void setFecha(DateTimeAtCreation fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
