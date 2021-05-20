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
public class Alumno extends Persona{
    
    private String Curso;

    public Alumno() {
        super();
    }

    public Alumno(String Curso, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.Curso = Curso;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Curso=" + Curso + ", Nombre=" + nombre + '}';
    }


       
}
