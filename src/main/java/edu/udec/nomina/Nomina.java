/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.nomina;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author ANDERSON SUAREZ ALBERT CHARRY
 * 
 *clase managed para vista nomina.xhtml
 * clase en la que se inyecta las variables de Index.java
 */
@Named(value = "nomina")
@RequestScoped
public class Nomina {
  
    private String nombre;
    private String apellido;
    private int diasT;
    private long sueldoB;
    private int nivelE;
    private int idiomas;
    private long nomina;
    private String nivelEE;
    
    //* anotacion que permite hcer la inyeccion de dependencias de la clase index
    @Inject
     private Index index;
    
    public long getNomina(){
        return nomina;
    }
    public void serNomina(long nomina){
        this.nomina = nomina;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public int getNivelE() {
        return nivelE;
    }

    public void setNivelE(int nivelE) {
        this.nivelE = nivelE;
    }

    public int getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(int idiomas) {
        this.idiomas = idiomas;
    }

    public String getNivelEE() {
        return nivelEE;
    }

    public void setNivelEE(String nivelEE) {
        this.nivelEE = nivelEE;
    }
    
    
    //*metodo encargado de calcular la nomina del empleado
    public String calcular(){
        nombre = index.getNombre();
        apellido = index.getApellido();
        diasT = index.getDiasT();
        sueldoB = index.getSueldoB();
        nivelE = 0;
        nivelEE = index.getNivelE();
        idiomas = index.getIdiomas().length;
        
        if(index.getNivelE().equals("primaria")){
            nivelE = 0;
        }else if(index.getNivelE().equals("secundaria")){
            nivelE= 0;
        }else if(index.getNivelE().equals("tecnico")){
            nivelE= 5000;
        }else if(index.getNivelE().equals("tecnologo")){
            nivelE= 15000;
        }else if(index.getNivelE().equals("profesional")){
            nivelE= 30000;
        }else if(index.getNivelE().equals("magister")){
            nivelE= 40000;
        }
        nomina =(sueldoB+(idiomas*10000)+nivelE)*diasT;       
        return ("/nomina");
    }
    
}
