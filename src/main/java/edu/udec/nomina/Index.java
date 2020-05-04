/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.nomina;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ANDERSON SUAREZ ALBERT CHARRY
 *
 * clase managed para la vista index.xhtml 
 * esta clase contiene getter y setter de la variables requeridas al momento del uso del programa
 */
@Named(value = "index")
@RequestScoped
public class Index {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getNivelE() {
        return nivelE;
    }

    public void setNivelE(String nivelE) {
        this.nivelE = nivelE;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public int getDiasT() {
        return diasT;
    }

    public void setDiasT(int diasT) {
        this.diasT = diasT;
    }

    public long getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(long sueldoB) {
        this.sueldoB = sueldoB;
    }

    private String nombre;
    private String apellido;
    private long cedula;
    private String fechaN;
    private String nivelE;
    private String idiomas[];
    private int diasT;
    private long sueldoB;
    
    //*contructor de la clase Index
    
    public Index() {
   
    }    
}
