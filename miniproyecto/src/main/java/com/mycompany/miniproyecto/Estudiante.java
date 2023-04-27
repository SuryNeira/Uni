/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproyecto;

/**
 *
 * @author suris
 */
public class Estudiante {
    private String Rut;
    private String Nombre;

    public Estudiante(String Rut, String Nombre) {
        this.Rut = Rut;
        this.Nombre = Nombre;
    }
     
    public Estudiante(){
        
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}
