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
public class Profesor extends Persona {
    
    private String especialidad;

    public Profesor() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + ", nombre=" + nombre + '}';
    }
    
    
    
}
