package edu.uv.model.pojos;
// Generated 06-may-2014 20:27:14 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Carrera generated by hbm2java
 */
public class Carrera  implements java.io.Serializable {


     private Integer idcarrera;
     private String nombreCarrera;
     private Set academias = new HashSet(0);

    public Carrera() {
    }

	
    public Carrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
    public Carrera(String nombreCarrera, Set academias) {
       this.nombreCarrera = nombreCarrera;
       this.academias = academias;
    }
   
    public Integer getIdcarrera() {
        return this.idcarrera;
    }
    
    public void setIdcarrera(Integer idcarrera) {
        this.idcarrera = idcarrera;
    }
    public String getNombreCarrera() {
        return this.nombreCarrera;
    }
    
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
    public Set getAcademias() {
        return this.academias;
    }
    
    public void setAcademias(Set academias) {
        this.academias = academias;
    }




}


