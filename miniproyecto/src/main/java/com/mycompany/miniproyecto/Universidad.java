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
public class Universidad {
    private ArrayList <Carrera> carreras=new ArrayList <Carrera>(); 

    public Universidad() {
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }
    
    

    public Boolean agregarCarrera(Carrera objeto){
        
        for(int i=0; i<carreras.size(); i++)
            if((carreras.get(i).equals(objeto)))
            
                return false;
        carreras.add(objeto);
        return true;   
    }
    
     public boolean agregarEstudiante(int idCarrera, Estudiante objeto){
         
         for(int i=0; i<carreras.size(); i++)
             if(carreras.get(i).getId()==idCarrera)
                 return carreras.get(i).AgegarEstudiante(objeto);
                 
        return false;

    }
     
     public Estudiante ObtenerEstudiante(Estudiante objeto){
         
         for(int i = 0; i<carreras.size(); i++)
             if(carreras.get(i).ObtenerEstudiante(objeto.getRut()) != null)
                 return carreras.get(i).ObtenerEstudiante(objeto.getRut());
         
         return null;
     }
    
}
