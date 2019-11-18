/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasDatos;

import javax.swing.Icon;




 
public class  Persona {
    
    public String idUsuario;
    private String nombre;
    private String apellido;
    private String genero;
    private String contrasena;
    private String descripcion;
    private Icon imagen;

    @Override
    public String toString() {
        return "Persona{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", contrasena=" + contrasena + '}';
    }

    public Persona(String idUsuario, String nombre, String apellido, String genero, String contrasena,String descripcion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.contrasena = contrasena;
        this.descripcion = descripcion;
        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/Image/fotoperfil.png"));
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
   
    
    
}
