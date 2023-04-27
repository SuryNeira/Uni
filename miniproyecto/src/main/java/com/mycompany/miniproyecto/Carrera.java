/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproyecto;

import java.util.ArrayList;

/**
 *
 * @author suris
 */
public class Carrera {
    private int id;
    private String Nombre;
    private String AreaDelSaber;
    private ArrayList  <Estudiante> estudiantes = new ArrayList<Estudiante>();
    
    public Carrera(int idCarrera, String nombre, String AreaDelSaber1){
        
    }

    public Carrera(int id, String Nombre, String AreaDelSaber, ArrayList estudiantes) {
        this.id = id;
        this.Nombre = Nombre;
        this.AreaDelSaber = AreaDelSaber;
        this.estudiantes = estudiantes;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAreaDelSaber() {
        return AreaDelSaber;
    }
    

    public void setAreaDelSaber(String AreaDelSaber) {
        this.AreaDelSaber = AreaDelSaber;
    }

    public ArrayList getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public Boolean AgegarEstudiante(Estudiante objeto){
        
        for(int i=0; i<estudiantes.size(); i++)
            if(estudiantes.get(i).equals(objeto))
                return false;
            
         estudiantes.add(objeto);
            return true;
    }
    
    public Estudiante ObtenerEstudiante(String Rut){
        
        for(int i=0; i<estudiantes.size(); i++)
            if(estudiantes.get(i).getRut().equals(Rut))
                return estudiantes.get(i);

        return null;
    }
    
    
    
    
}
