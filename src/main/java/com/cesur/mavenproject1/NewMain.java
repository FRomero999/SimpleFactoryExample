/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesur.mavenproject1;

/**
 *
 * @author paco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FactoryPersona fp = new FactoryPersona();
        
        Alumno a = (Alumno) fp.crearPersona("alumno");      
        Profesor b = (Profesor) fp.crearPersona("profesor");
        a.setNombre("Paco");
        a.setCurso("DAM");

        
        b.setNombre("Juan");
        b.setEspecialidad("Informática");
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        
        
    }
    
}
