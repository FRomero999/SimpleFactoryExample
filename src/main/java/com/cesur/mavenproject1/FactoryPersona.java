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
public class FactoryPersona {
    
    public FactoryPersona() {
    }

    public static Persona crearPersona(String tipo){
        
        if(tipo=="alumno"){
            return new Alumno();
        }
        else if(tipo=="profesor"){
            return new Profesor();
        }
        else return null;
                
    }
    
}
