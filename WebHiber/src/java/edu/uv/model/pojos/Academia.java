package edu.uv.model.pojos;
// Generated 06-may-2014 20:27:14 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Academia generated by hbm2java
 */
public class Academia  implements java.io.Serializable {


     private Integer idAcademia;
     private Personal personal;
     private String nombreAcad;
     private Set carreras = new HashSet(0);
     private Set experieciaeducativas = new HashSet(0);

    public Academia() {
    }

	
    public Academia(Personal personal, String nombreAcad) {
        this.personal = personal;
        this.nombreAcad = nombreAcad;
    }
    public Academia(Personal personal, String nombreAcad, Set carreras, Set experieciaeducativas) {
       this.personal = personal;
       this.nombreAcad = nombreAcad;
       this.carreras = carreras;
       this.experieciaeducativas = experieciaeducativas;
    }
   
    public Integer getIdAcademia() {
        return this.idAcademia;
    }
    
    public void setIdAcademia(Integer idAcademia) {
        this.idAcademia = idAcademia;
    }
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    public String getNombreAcad() {
        return this.nombreAcad;
    }
    
    public void setNombreAcad(String nombreAcad) {
        this.nombreAcad = nombreAcad;
    }
    public Set getCarreras() {
        return this.carreras;
    }
    
    public void setCarreras(Set carreras) {
        this.carreras = carreras;
    }
    public Set getExperieciaeducativas() {
        return this.experieciaeducativas;
    }
    
    public void setExperieciaeducativas(Set experieciaeducativas) {
        this.experieciaeducativas = experieciaeducativas;
    }




}


