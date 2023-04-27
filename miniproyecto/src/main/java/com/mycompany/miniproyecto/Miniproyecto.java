/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproyecto;

import java.util.Scanner;

/**
 *
 * @author suris
 */
public class Miniproyecto {

    public static Estudiante estudiante;
    public static Carrera carrera;
    public static Universidad universidad;
    
    public static void main(String args[]) {
        //datos estudiante
        String rut;
        String nombre;
        int idCarrera;
        String AreaDelSaber;
        
        Scanner Entrada=new Scanner(System.in);
        
        
        //crear Carrera
        System.out.println("ID Carrera");
        idCarrera=Entrada.nextInt();
        System.out.println("Nombre Carrera");
        nombre=Entrada.next();
        System.out.println("Area del Saber");
        AreaDelSaber=Entrada.next();
        universidad=new Universidad();
        carrera=new Carrera(idCarrera, nombre, AreaDelSaber);
        
        
        if(universidad.agregarCarrera(new Carrera(idCarrera,nombre,AreaDelSaber)))
            System.out.println("Carrera creado!!");
        else
            System.out.println("ya existe");
        
        
        
        //insertar datos del estudiante
        System.out.println("Digite los datos ");
        System.out.println("Rut Estudiante");
        rut=Entrada.next();
        System.out.println("Nombre del estudiante");
        nombre=Entrada.next();
        System.out.println("carrera a la que pertenece");
        idCarrera=Entrada.nextInt();
        
        System.out.println(universidad.getCarreras().size());
        
        estudiante=new Estudiante(rut,nombre);
        
        if(universidad.agregarEstudiante(idCarrera, estudiante))
            if(carrera.AgegarEstudiante(estudiante)){
                System.out.println("Estudiante fue creado!");
            }

        else
           System.out.println("Estudiante no fue creado!");
        
        
        
}
}
