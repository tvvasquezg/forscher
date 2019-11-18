/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasDatos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Tania
 */
public class ListaEnlazada {
    
    private Nodo cabeza;
    private int tamao;

    @Override
    public String toString() {
        return "ListaEnlazada{" + "cabeza=" + cabeza.toString() + ", tamao=" + tamao + '}';
    }

    public ListaEnlazada() {
        cabeza = null;
    }
    
    void agregarDelante(Object o){
        if(cabeza == null){
            cabeza = new Nodo(o);
          }
        else{
        Nodo temp = cabeza;
        Nodo nuevo = new Nodo(o);
        nuevo.agregar(temp);
        cabeza = nuevo; 
        
        }
        
        tamao++; 
    }
    
    void agregarDespues(Object o,Object remp){
        Nodo temp=cabeza;
        Nodo temp2= new Nodo(remp);
        
       while(temp != temp2 && temp.verSiguente() != null){
          temp = temp.verSiguente();
       }
       
       if(temp.verSiguente()!= null){
       temp2.setDatos(o);
       temp2.agregar(temp.verSiguente());
       temp.agregar(temp2);
       tamao++;
       }else{
           System.out.println("El dato "+remp.toString()+" no existe");
       }
        
    }
    
    Object ver(int indice){
    Nodo temp = cabeza;
    for (int i=0;i<indice;i++){
        temp = temp.verSiguente();
    
    }
    return temp.verDato();
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
       
        BufferedReader bf = new BufferedReader(new FileReader("estudiantes.csv"));
        String sCadena;
        
       // int cont2 = 0;
        //String profe; 
         ListaEnlazada l = new ListaEnlazada();
        
        
        while ((sCadena = bf.readLine())!=null) {
             int cont2 = 0;
            String[] tempo = new String[8];
           // System.out.println(tempo[0]);
           // profe = "profe"+cont;
            //System.out.println(sCadena);
            StringTokenizer st = new StringTokenizer(sCadena,";");
            while (st.hasMoreTokens()){
                
                tempo[cont2] = st.nextToken(";");
               // System.out.println(tempo[cont2]+"------------------------"+cont2);
                cont2++;
           }
            
             // public Estudiante(String idUsuario, String genero, String nombre, String apellido,String universidad, String programaA,String contrasena) {
            //String idUsuario, String nombre, String apellido, Password contrasena,String materia, String facultad, String centroEducativo
            //Estudiante estu = new Estudiante(tempo[0], tempo[1], tempo[2], tempo[3], tempo[4],tempo[5],tempo[6]) ;
            //l.agregarDelante(estu);
            }
        
        
        
        
        
        
      /* 
        l.agregarDelante(0);
        l.agregarDelante(2);
        l.agregarDelante(5);
        l.agregarDelante(9);
        l.agregarDelante(8);
        l.agregarDelante(6);
        l.agregarDelante(26);
        */
      
        
        long inicio=System.nanoTime();

        
        //System.out.println(l.tamao);
        //l.agregarDelante(new Estudiante("Liset","Mora","m","Andes","Medicina","Teamocris","tatiana18"));
       long finall=System.nanoTime();
       double dif= (double)(finall-inicio)*1.0e-6;
        System.out.println(dif);
        
                
         
    }
    
    
}


